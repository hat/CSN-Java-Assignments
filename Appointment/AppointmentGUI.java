import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.geometry.*;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import java.util.ArrayList;

/**
 * @author Tony Hendrick
 * @version 4/23/15
 *
 * Creates a GUI to allow the user to set appointments for Monday-Friday
 */
public class AppointmentGUI extends Application
{
    //VBox variables to store all the labels, text fields, and text areas
    private VBox firstVBox = new VBox();
    private VBox secondVBox = new VBox();
    private VBox thirdVBox = new VBox();
    private VBox fourthVBox = new VBox();
    private VBox fifthVBox = new VBox();

    //Declares labels to hold the day of week, time, and details
    private Label dayOfWeekLabelOne = new Label("Monday");
    private Label dayOfWeekLabelTwo = new Label("Tuesday");
    private Label dayOfWeekLabelThree = new Label("Wednesday");
    private Label dayOfWeekLabelFour = new Label("Thursday");
    private Label dayOfWeekLabelFive = new Label("Friday");

    private Label timeLabelOne = new Label("Time: ");
    private Label timeLabelTwo = new Label("Time: ");
    private Label timeLabelThree = new Label("Time: ");
    private Label timeLabelFour = new Label("Time: ");
    private Label timeLabelFive = new Label("Time: ");

    private Label detailsLabelOne = new Label("Details: ");
    private Label detailsLabelTwo = new Label("Details: ");
    private Label detailsLabelThree = new Label("Details: ");
    private Label detailsLabelFour = new Label("Details: ");
    private Label detailsLabelFive = new Label("Details: ");

    //Declares text fields to hold the time
    private TextField timeTextFieldOne = new TextField("800a");
    private TextField timeTextFieldTwo = new TextField("800a");
    private TextField timeTextFieldThree = new TextField("800a");
    private TextField timeTextFieldFour = new TextField("800a");
    private TextField timeTextFieldFive = new TextField("800a");

    //Declares TextAreas to hold the details
    private TextArea detailsTextAreaOne = new TextArea();
    private TextArea detailsTextAreaTwo = new TextArea();
    private TextArea detailsTextAreaThree = new TextArea();
    private TextArea detailsTextAreaFour = new TextArea();
    private TextArea detailsTextAreaFive = new TextArea();

    //Declares buttons
    private Button submitButton = new Button("Submit");
    private Button clearButton = new Button("Clear");
    private Button openButton = new Button("Open");

    //Declare GridPane
    private GridPane gridPane = new GridPane();

    //Declare HBox
    private HBox hBox = new HBox();

    //Declare scene
    private Scene scene;

    //Declare ArrayList to hold Appointment type
    ArrayList<Appointment> appointmentList = new ArrayList<Appointment>();

    /*
        Sets the properties of a TextArea object.

        @param detailTextArea the TextArea to set the properties of
     */
    public void customDetailTextArea(TextArea detailTextArea)
    {
        //Declares double variables
        double detailsTextFieldWidth = 200.0; //the width of the TextArea
        double detailsTextFieldHeight = 100.0; //the height of the TextArea

        //Declares string variable
        String detailsPromptText = "Appointment description...";  //the prompt text of the TextArea

        //Sets properties
        detailTextArea.setWrapText(true); //wraps text
        detailTextArea.setMaxHeight(detailsTextFieldHeight); //sets height
        detailTextArea.setMaxWidth(detailsTextFieldWidth); //sets width
        detailTextArea.setPromptText(detailsPromptText); //sets prompt text
    }

    /*
        Sets the properties of a TextField object.

        @param timeTextField the TextField to set the properties of
    */
    public void customTimeTextField(TextField timeTextField)
    {
        //Declares double variable
        double timeTextFieldWidth = 60.0; //TextField width

        //Sets properties
        timeTextField.setMaxWidth(timeTextFieldWidth); //sets width
    }

    /*
        Passes all the timeTextField objects to the customTimeTextField function
    */
    public void setTimeTextField()
    {
        //Passes TextField objects to customTimeTextField function
        customTimeTextField(timeTextFieldOne);
        customTimeTextField(timeTextFieldTwo);
        customTimeTextField(timeTextFieldThree);
        customTimeTextField(timeTextFieldFour);
        customTimeTextField(timeTextFieldFive);
    }

    /*
        Passes all the detailTextArea objects to the customDetailTextArea function
    */
    public void setDetailTextArea()
    {
        //Passes TextArea objects to customDetailTextArea function
        customDetailTextArea(detailsTextAreaOne);
        customDetailTextArea(detailsTextAreaTwo);
        customDetailTextArea(detailsTextAreaThree);
        customDetailTextArea(detailsTextAreaFour);
        customDetailTextArea(detailsTextAreaFive);
    }

    /*
        Sets properties of a GridPane object
    */
    public void customGridPane()
    {
        //Sets properties
        gridPane.setHalignment(submitButton, HPos.RIGHT); //positions submitButton
        gridPane.setHalignment(clearButton, HPos.CENTER); //positions clearButton
        gridPane.setHalignment(openButton, HPos.LEFT); //positions openButton
        gridPane.setVgap(10.0); //sets vertical gap
    }

    /*
        Sets the properties of a HBox object
     */
    public void customHBox()
    {
        //Sets properties
        BackgroundFill background = new BackgroundFill(Color.WHITE, CornerRadii.EMPTY, Insets.EMPTY); //creates background
        hBox.setBackground(new Background(background)); //sets background
    }

    /*
        Adds the dayOfWeekLabels, timeLabels, detailLabels, and detailTextAreas to the VBoxs
     */
    public void addToVBoxs()
    {
        firstVBox.getChildren().addAll(dayOfWeekLabelOne, timeLabelOne, timeTextFieldOne, detailsLabelOne, detailsTextAreaOne);

        secondVBox.getChildren().addAll(dayOfWeekLabelTwo, timeLabelTwo, timeTextFieldTwo, detailsLabelTwo, detailsTextAreaTwo);

        thirdVBox.getChildren().addAll(dayOfWeekLabelThree, timeLabelThree, timeTextFieldThree, detailsLabelThree, detailsTextAreaThree);

        fourthVBox.getChildren().addAll(dayOfWeekLabelFour, timeLabelFour, timeTextFieldFour, detailsLabelFour, detailsTextAreaFour);

        fifthVBox.getChildren().addAll(dayOfWeekLabelFive, timeLabelFive, timeTextFieldFive, detailsLabelFive, detailsTextAreaFive);
    }

    /*
        Adds the VBox objects to the gridPane and sets their positions
    */
    public void addToGridPane()
    {
        gridPane.add(firstVBox, 1, 0);
        gridPane.add(secondVBox, 2, 0);
        gridPane.add(thirdVBox, 3, 0);
        gridPane.add(fourthVBox, 4, 0);
        gridPane.add(fifthVBox, 5, 0);
        gridPane.add(submitButton, 2, 2);
        gridPane.add(clearButton, 3, 2);
        gridPane.add(openButton, 4, 2);
    }

    /*
        Sets the buttonActions event handler
     */
    public void setButtonActions()
    {
        //Sets submitButton OnAction
        submitButton.setOnAction(new EventHandler<javafx.event.ActionEvent>()
        {
            @Override
            public void handle(javafx.event.ActionEvent event)
            {
                //Adds the data from the timeTextField and detailsTextArea to the ArrayList appointmentList
                appointmentList.add(0, new Appointment(DayOfWeek.MONDAY, timeTextFieldOne.getText(), detailsTextAreaOne.getText()));

                appointmentList.add(1, new Appointment(DayOfWeek.TUESDAY, timeTextFieldTwo.getText(), detailsTextAreaTwo.getText()));

                appointmentList.add(2, new Appointment(DayOfWeek.WEDNESDAY, timeTextFieldThree.getText(), detailsTextAreaThree.getText()));

                appointmentList.add(3, new Appointment(DayOfWeek.THURSDAY, timeTextFieldFour.getText(), detailsTextAreaFour.getText()));

                appointmentList.add(4, new Appointment(DayOfWeek.FRIDAY, timeTextFieldFive.getText(), detailsTextAreaFive.getText()));
            }
        });

        //Sets the clearButton OnAction
        clearButton.setOnAction(new EventHandler<javafx.event.ActionEvent>()
        {
            @Override
            public void handle(javafx.event.ActionEvent event)
            {
                //Clears all the data from the timeTextField and detailsTextArea
                timeTextFieldOne.setText("");
                timeTextFieldTwo.setText("");
                timeTextFieldThree.setText("");
                timeTextFieldFour.setText("");
                timeTextFieldFive.setText("");

                detailsTextAreaOne.setText("");
                detailsTextAreaTwo.setText("");
                detailsTextAreaThree.setText("");
                detailsTextAreaFour.setText("");
                detailsTextAreaFive.setText("");
            }
        });

        //Sets the openButton OnAction
        openButton.setOnAction(new EventHandler<javafx.event.ActionEvent>()
        {
            @Override
            public void handle(javafx.event.ActionEvent event)
            {
                //Loads the time and appointment details from the ArrayList appointmentList
                timeTextFieldOne.setText(appointmentList.get(0).time);
                timeTextFieldTwo.setText(appointmentList.get(1).time);
                timeTextFieldThree.setText(appointmentList.get(2).time);
                timeTextFieldFour.setText(appointmentList.get(3).time);
                timeTextFieldFive.setText(appointmentList.get(4).time);

                detailsTextAreaOne.setText(appointmentList.get(0).appointment);
                detailsTextAreaTwo.setText(appointmentList.get(1).appointment);
                detailsTextAreaThree.setText(appointmentList.get(2).appointment);
                detailsTextAreaFour.setText(appointmentList.get(3).appointment);
                detailsTextAreaFive.setText(appointmentList.get(4).appointment);
            }
        });
    }

    /*
        Start function to display the GUI.

        @param primaryStage stage in which the GUI sits
     */
    @Override
    public void start(Stage primaryStage)
    {
        //Sets the primaryStage title
        primaryStage.setTitle("Appointment");

        //Calls the above functions
        setTimeTextField();

        setDetailTextArea();

        setButtonActions();

        customGridPane();

        addToVBoxs();

        addToGridPane();

        customHBox();

        //Adds the gridPane to the HBox
        hBox.getChildren().addAll(gridPane);

        //Sets the scene
        scene = new Scene(hBox, 1000, 250);

        //Adds the scene to the primaryStage
        primaryStage.setScene(scene);

        //Makes it where the stage cannot be resized
        primaryStage.setResizable(false);

        //Shows the primaryStage
        primaryStage.show();
    }
}
