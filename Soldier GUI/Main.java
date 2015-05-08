package sample;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import sample.MessageDialog;

import javax.swing.*;

/**
    @Author Tony Hendrick
    @Version 0.1

    This program displays a form to enter the information for a soldier using the Solder.class file
    as well as displays another window to display the entered data after a create soldier button (submit)
    is pressed using JavaFX.

    IMPORTANT: Throws errors/does not work if Coast Guard is selected as military branch, setting the rank,
    setting the job specialty code, get SSN method, and has no way to print officer or enlisted.
    Problem is believed to exist on the Soldier.class file.

 */

public class Main extends Application
{
    //Creates Soldier object
    private Soldier basicSoldier = new Soldier();

    //Creates GUI Objects

    //Courtesy title label and text field
    private Label courtesyTitleLabel = new Label("Courtesy Title: ");
    private TextField courtesyTitleTextField = new TextField();

    //First name, middle name, and last name labels and text fields
    private Label firstNameLabel = new Label("First Name: ");
    private TextField firstNameTextField = new TextField();
    private Label middleNameLabel = new Label("Middle Name: ");
    private TextField middleNameTextField = new TextField();
    private Label lastNameLabel = new Label("Last Name: ");
    private TextField lastNameTextField = new TextField();

    //Suffix label and text field
    private Label suffixLabel = new Label("Suffix: ");
    private TextField suffixTextField = new TextField();

    //Age label and text field
    private Label ageLabel = new Label("Age: ");
    private TextField ageTextField = new TextField();

    //Gender label and radio buttons
    private Label genderLabel = new Label("Gender: ");
    final ToggleGroup genderToggleGroup = new ToggleGroup();
    private RadioButton genderMaleRadioButton = new RadioButton("Male");
    private RadioButton genderFemaleRadioButton = new RadioButton("Female");

    //Officer or enlisted radio buttons
    final ToggleGroup ooeToggleGroup = new ToggleGroup();
    private RadioButton ooeOfficerRadioButton = new RadioButton("Officer");
    private RadioButton ooeEnlistedRadioButton = new RadioButton("Enlisted");

    //Rank label and text field
    private Label rankLabel = new Label("Rank: ");
    private TextField rankTextField = new TextField();

    //Social security number label and text field
    private Label ssnLabel = new Label("Social Security Number: ");
    private TextField ssnTextField = new TextField();

    //Blood type radio buttons
    final ToggleGroup bTypeToggleGroup = new ToggleGroup();
    private RadioButton bTypeOPosRadioButton = new RadioButton("O+");
    private RadioButton bTypeONegRadioButton = new RadioButton("O-");
    private RadioButton bTypeAPosRadioButton = new RadioButton("A+");
    private RadioButton bTypeANegRadioButton = new RadioButton("A-");
    private RadioButton bTypeBPosRadioButton = new RadioButton("B+");
    private RadioButton bTypeBNegRadioButton = new RadioButton("B-");
    private RadioButton bTypeABPosRadioButton = new RadioButton("AB+");
    private RadioButton bTypeABNegRadioButton = new RadioButton("AB-");

    //Job specialty label and text field
    private Label jobSpecialtyLabel = new Label("Job Specialty: ");
    private TextField jobSpecialtyTextField = new TextField();

    //Military branch radio buttons
    final ToggleGroup mBToggleGroup = new ToggleGroup();
    private RadioButton mBCoastGuardRadioButton = new RadioButton("Coast Guard");
    private RadioButton mBAirForceRadioButton = new RadioButton("Air Force");
    private RadioButton mBArmyRadioButton = new RadioButton("Army");
    private RadioButton mBNavyRadioButton = new RadioButton("Navy");
    private RadioButton mBMarinesRadioButton = new RadioButton("Marines");

    //Create soldier button
    private Button createSoldierButton = new Button("Create Soldier");

    //Declares Scene
    private Scene scene;


    @Override
    public void start(Stage primaryStage) throws Exception
    {
        //Fills in basic soldier Data
        basicSoldier.setCourtesyTitle("Mr.");
        basicSoldier.setFirstName("John");
        basicSoldier.setMiddleName("A.");
        basicSoldier.setLastName("Doe");
        basicSoldier.setSuffix("Jr");
        basicSoldier.setAge(17);
        basicSoldier.setSSNum("000-00-0000");

        //Sets the text of the text fields
        courtesyTitleTextField.setText(basicSoldier.getCourtesyTitle());
        firstNameTextField.setText(basicSoldier.getFirstName());
        middleNameTextField.setText(basicSoldier.getMiddleName());
        lastNameTextField.setText(basicSoldier.getLastName());
        suffixTextField.setText(basicSoldier.getSuffix());
        ageTextField.setText(String.valueOf(basicSoldier.getAge()));
        ssnTextField.setText(basicSoldier.getSSNum());
        rankTextField.setText(basicSoldier.getRank());
        jobSpecialtyTextField.setText(basicSoldier.getJobSpecialtyCode());

        //Sets the gender radio buttons
        if(basicSoldier.getGender().equals("male"))
        {
            genderMaleRadioButton.setSelected(true);
            genderFemaleRadioButton.setSelected(false);
        }
        else
        {
            genderMaleRadioButton.setSelected(false);
            genderFemaleRadioButton.setSelected(true);
        }

        //Sets the officer or enlisted radio buttons
        ooeOfficerRadioButton.setSelected(true);

        //Sets the blood type radio buttons
        bTypeOPosRadioButton.setSelected(true);

        //Sets the marine branch radio buttons
        mBAirForceRadioButton.setSelected(true);

        //Sets the title of the stage
        primaryStage.setTitle("Soldier Information");

        //Event Handlers

        //Create soldier button listener
        createSoldierButton.setOnAction(new ButtonListener());

        //Adds gender radio buttons to toggle group and sets soldier info accordingly
        genderMaleRadioButton.setToggleGroup(genderToggleGroup);
        genderFemaleRadioButton.setToggleGroup(genderToggleGroup);
        genderToggleGroup.selectedToggleProperty().addListener(new ChangeListener<Toggle>()
        {
            @Override
            public void changed(ObservableValue<? extends Toggle> observable, Toggle oldValue, Toggle newValue)
            {
                //Sets the soldier's gender to the radio button that is selected
                String selectedGender;
                selectedGender = getRadioButtonText(genderToggleGroup).toLowerCase();
                basicSoldier.setGender(selectedGender);
            }
        });

        //Adds officer or enlisted buttons to toggle group and sets soldier info accordingly
        ooeOfficerRadioButton.setToggleGroup(ooeToggleGroup);
        ooeEnlistedRadioButton.setToggleGroup(ooeToggleGroup);
        ooeToggleGroup.selectedToggleProperty().addListener(new ChangeListener<Toggle>()
        {
            @Override
            public void changed(ObservableValue<? extends Toggle> observable, Toggle oldValue, Toggle newValue)
            {
                //Sets the soldier's officer or enlisted status to the radio button that is selected
                String selectedOOE;
                selectedOOE = getRadioButtonText(ooeToggleGroup);
                basicSoldier.setOfficerOrEnlisted(selectedOOE);
            }

        });

        //Blood type radio button listener
        bTypeOPosRadioButton.setToggleGroup(bTypeToggleGroup);
        bTypeONegRadioButton.setToggleGroup(bTypeToggleGroup);
        bTypeAPosRadioButton.setToggleGroup(bTypeToggleGroup);
        bTypeANegRadioButton.setToggleGroup(bTypeToggleGroup);
        bTypeBPosRadioButton.setToggleGroup(bTypeToggleGroup);
        bTypeBNegRadioButton.setToggleGroup(bTypeToggleGroup);
        bTypeABPosRadioButton.setToggleGroup(bTypeToggleGroup);
        bTypeABNegRadioButton.setToggleGroup(bTypeToggleGroup);
        bTypeToggleGroup.selectedToggleProperty().addListener(new ChangeListener<Toggle>()
        {
            @Override
            public void changed(ObservableValue<? extends Toggle> observable, Toggle oldValue, Toggle newValue)
            {
                //Sets the soldier's blood type to the radio button that is selected
                String selectedBloodType;
                selectedBloodType = getRadioButtonText(bTypeToggleGroup);
                basicSoldier.setBloodType(selectedBloodType);
            }
        });

        //Military branch radio button listener
        mBCoastGuardRadioButton.setToggleGroup(mBToggleGroup);
        mBAirForceRadioButton.setToggleGroup(mBToggleGroup);
        mBArmyRadioButton.setToggleGroup(mBToggleGroup);
        mBNavyRadioButton.setToggleGroup(mBToggleGroup);
        mBMarinesRadioButton.setToggleGroup(mBToggleGroup);
        mBToggleGroup.selectedToggleProperty().addListener(new ChangeListener<Toggle>()
        {
            @Override
            public void changed(ObservableValue<? extends Toggle> observable, Toggle oldValue, Toggle newValue)
            {
                String selectedMilitaryBranch;
                selectedMilitaryBranch = getRadioButtonText(mBToggleGroup);
                basicSoldier.setMilitaryBranch(selectedMilitaryBranch);
            }
        });

        //Declares vertical layout
        VBox canvas = new VBox();

        //Adds all of the elements to the VBox
        canvas.getChildren().addAll(courtesyTitleLabel, courtesyTitleTextField, firstNameLabel, firstNameTextField, middleNameLabel, middleNameTextField, lastNameLabel, lastNameTextField, suffixLabel, suffixTextField, ageLabel, ageTextField, genderLabel, genderMaleRadioButton, genderFemaleRadioButton, ooeOfficerRadioButton,ooeEnlistedRadioButton, rankLabel, rankTextField, ssnLabel, ssnTextField, bTypeOPosRadioButton, bTypeONegRadioButton, bTypeAPosRadioButton, bTypeANegRadioButton, bTypeBPosRadioButton, bTypeBNegRadioButton, bTypeABPosRadioButton, bTypeABNegRadioButton, jobSpecialtyLabel, jobSpecialtyTextField, mBCoastGuardRadioButton, mBAirForceRadioButton, mBArmyRadioButton, mBNavyRadioButton, mBMarinesRadioButton, createSoldierButton);

        //Sets the scene size
        scene = new Scene(canvas, 220, 730);

        //Adds the scene to the stage and makes it visible
        primaryStage.setScene(scene);
        primaryStage.show();
    }


    public static void main(String[] args)
    {
        launch(args);
    }

    //Button Listener to create the soldier and display the entered data in a new window
    private class ButtonListener implements EventHandler<ActionEvent>
    {
        public void handle(ActionEvent e)
        {
            Button pressedButton = new Button();
            int printStyle = 0;

            if(e.getSource() instanceof Button)
            {
                pressedButton = (Button)e.getSource();
            }

            if(pressedButton.getText().equals("Create Soldier"))
            {
                Stage dialogStage = new Stage();

                VBox dialogVBox = new VBox();

                //Gets the information typed into the form
                printStyle = setSoldierTextFieldInformation();

                //Prints the name based on what information is left blank
                if(printStyle == 0)
                {
                    dialogVBox.getChildren().add(new Text("Name: " + basicSoldier.getCourtesyTitle() + " " + basicSoldier.getFirstName() + " " + basicSoldier.getMiddleName() + " " + basicSoldier.getLastName() + " " + basicSoldier.getSuffix()));
                }
                else if(printStyle == 1)
                {
                    dialogVBox.getChildren().add(new Text("Name: " + basicSoldier.getFirstName() + " " + basicSoldier.getMiddleName() + " " + basicSoldier.getLastName() + " " + basicSoldier.getSuffix()));
                }
                else if(printStyle == 2)
                {
                    dialogVBox.getChildren().add(new Text("Name: " + basicSoldier.getCourtesyTitle() + " " + basicSoldier.getFirstName() + " " + basicSoldier.getLastName() + " " + basicSoldier.getSuffix()));
                }
                else if(printStyle == 3)
                {
                    dialogVBox.getChildren().add(new Text("Name: " + basicSoldier.getCourtesyTitle() + " " + basicSoldier.getFirstName() + " " + basicSoldier.getMiddleName() + " " + basicSoldier.getLastName()));
                }
                else if(printStyle == 4)
                {
                    dialogVBox.getChildren().add(new Text("Name: " + basicSoldier.getFirstName() + " " + basicSoldier.getLastName() + " " + basicSoldier.getSuffix()));
                }
                else if(printStyle == 5)
                {
                    dialogVBox.getChildren().add(new Text("Name: " + basicSoldier.getFirstName() + " " + basicSoldier.getMiddleName() + " " + basicSoldier.getLastName()));
                }
                else if(printStyle == 6)
                {
                    dialogVBox.getChildren().add(new Text("Name: " + basicSoldier.getCourtesyTitle() + " " + basicSoldier.getFirstName() + " " + basicSoldier.getLastName()));
                }
                else if(printStyle == 7)
                {
                    dialogVBox.getChildren().add(new Text("Name: " + basicSoldier.getFirstName() + " " + basicSoldier.getLastName()));
                }

                //Adds age, gender, rank, social security number, blood type, job specialty, and military branch to dialogVBox
                dialogVBox.getChildren().add(new Text("Age: " + basicSoldier.getAge()));

                dialogVBox.getChildren().add(new Text("Gender: " + basicSoldier.getGender()));

                //Officer or Enlisted has no get statement
                //dialogVBox.getChildren().add(new Text("Status: " + basicSoldier.get))

                dialogVBox.getChildren().add(new Text("Rank: " + basicSoldier.getRank()));

                dialogVBox.getChildren().add(new Text("Social Security Number: " + basicSoldier.getSSNum()));

                dialogVBox.getChildren().add(new Text("Blood Type: " + basicSoldier.getBloodType()));

                dialogVBox.getChildren().add(new Text("Job Specialty: " + basicSoldier.getJobSpecialtyCode()));

                dialogVBox.getChildren().add(new Text("Military Branch: " + basicSoldier.getMilitaryBranch()));

                Scene dialogScene = new Scene(dialogVBox, 280, 150);

                dialogStage.setTitle("Created Soldier");

                //Adds the dialog scene to the stage
                dialogStage.setScene(dialogScene);

                //Shows the stage
                dialogStage.show();
            }
        }
    }


    //Sets the soldier information based on the text fields
    int setSoldierTextFieldInformation() throws IllegalArgumentException
    {
        int omitCode = 0;

        try
        {
            //Checks which name fields are left blank
            if(!courtesyTitleTextField.getText().equals(""))
            {
                basicSoldier.setCourtesyTitle(courtesyTitleTextField.getText());
            }
            else
            {
                omitCode = 1;
            }

            basicSoldier.setFirstName(firstNameTextField.getText());

            if(!middleNameTextField.getText().equals(""))
            {
                basicSoldier.setMiddleName(middleNameTextField.getText());
            }
            else
            {
                omitCode = 2;
            }

            basicSoldier.setLastName(lastNameTextField.getText());

            if(!suffixTextField.getText().equals(""))
            {
                basicSoldier.setSuffix(suffixTextField.getText());
            }
            else
            {
                omitCode = 3;
            }

            if(courtesyTitleTextField.getText().equals("") && middleNameTextField.getText().equals("") && suffixTextField.getText().equals(""))
            {
                omitCode = 7;
            }
            else if(courtesyTitleTextField.getText().equals("") && middleNameTextField.getText().equals(""))
            {
                omitCode = 4;
            }
            else if(courtesyTitleTextField.getText().equals("") && suffixTextField.getText().equals(""))
            {
                omitCode = 5;
            }
            else if(middleNameTextField.getText().equals("") && suffixTextField.getText().equals(""))
            {
                omitCode = 6;
            }

            //Sets the age, rank, ssn, and job specialty of the soldier
            basicSoldier.setAge(Integer.valueOf(ageTextField.getText()));
            basicSoldier.setRank(rankTextField.getText());
            basicSoldier.setSSNum(ssnTextField.getText());
            basicSoldier.setJobSpecialtyCode(jobSpecialtyTextField.getText());
        }
        catch(IllegalArgumentException iae)
        {
            new MessageDialog("Error: Either the rank, social security number, or the job specialty is not compatible for a soldier...\nPROBLEM POTENTIALLY EXISTS IN SOLDIER.CLASS FILE SETTING RANK AND JOB SPECIALTY CODE");
        }

        return omitCode;
    }

    //Returns the text of the button that is pressed in the toggle group
    String getRadioButtonText(ToggleGroup grbtToggleGroup)
    {
        //Declares String variable
        String radioButtonText;

        //Sets the string variable to the value of the toString method of the radio button in the toggle group
        radioButtonText = grbtToggleGroup.selectedToggleProperty().toString();

        //Finds the first single apostrophe in the string variable
        int firstSingleApostrophe = radioButtonText.indexOf('\'');

        //Finds the last single apostrophe in the string variable
        int lastSingleApostrophe = radioButtonText.lastIndexOf('\'');

        //Sets the string variable to the string that lies within the two apostrophes
        radioButtonText = radioButtonText.substring(firstSingleApostrophe + 1, lastSingleApostrophe);

        //Returns the string variable
        return radioButtonText;
    }

}