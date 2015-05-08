package sample;

/**
 * Created by tonyhendrick on 2/27/15.
 */

import javafx.stage.*; //Gives access to Stage and Modality classes used here
import javafx.scene.Scene;
import javafx.scene.control.*;//Gives access to both button and label classes
import javafx.geometry.Pos;
import javafx.scene.layout.VBox;
import javafx.event.*; //Gives access to EventHandler and ActionEvent

public class MessageDialog extends Stage
{
    public MessageDialog(String message)
    {
        //Inherits Stage class
        super();

        //Modal = pop-up that disables background windows
        this.initModality(Modality.WINDOW_MODAL);

        Label messageLabel = new Label(message);
        messageLabel.setAlignment(Pos.BASELINE_CENTER);

        Button closeButton = new Button("OK");
        closeButton.setOnAction(new EventHandler<ActionEvent>()
        {
            public void handle(ActionEvent e)
            {
                Button callingButton = (Button) e.getSource();
                Stage dialogToClose = (Stage) callingButton.getScene().getWindow();
                dialogToClose.hide();
            }
        });

        VBox layout = new VBox(40.0);
        layout.setAlignment(Pos.BASELINE_CENTER);
        layout.getChildren().addAll(messageLabel, closeButton);

        this.setScene(new Scene(layout, 150, 150));
        this.setResizable(false);
        this.show();
    }

    private class CloseHandler implements EventHandler<ActionEvent>
    {
        public void handle(ActionEvent e)
        {
            Button callingButton = (Button) e.getSource();
            Stage dialogToClose = (Stage) callingButton.getScene().getWindow();
            dialogToClose.hide();
        }
    }
}