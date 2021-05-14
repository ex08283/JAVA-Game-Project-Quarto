package Quarto.View.MenuScreen;

import Quarto.View.UISettings;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.*;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class NamesView extends BorderPane {
    private GridPane gridPane;
    private TextField player1TextField;
    private TextField player2TextField;
    private Label player1Label;
    private Label player2Label;
    private Button oneVoneButton;
    private Button startButton;
    private UISettings uiSettings;


//    private CheckBox checkBox;
//    private ImageView imageView;
//    private ComboBox<String> comboBox;
//    private MenuItem menuItem;

    public NamesView(UISettings uiSettings) {
        initialiseNodes();
        layoutNodes();
    }

    public void initialiseNodes() {
        this.gridPane = new GridPane();
        player1TextField = new TextField();
        player2TextField = new TextField();

        player1Label = new Label("Name player 1: ");
        player2Label = new Label("Name player 2: ");

        oneVoneButton = new Button("One V One");
        startButton = new Button("Start");


    }

    public void layoutNodes() {
        this.setPadding(new Insets(20));
        this.startButton.setPrefSize(100,20);


//        this.add(oneVoneButton, 0, 0);
        gridPane.add(player1Label, 0, 2);
        gridPane.add(player2Label,0, 3);
        gridPane.add(player1TextField, 1, 2);
        gridPane.add(player2TextField, 1, 3);
        gridPane.add(new Label(""), 0,4 );
        gridPane.add(startButton, 1, 5, 1, 1);
        gridPane.setGridLinesVisible(false);

        this.setCenter(gridPane);
        gridPane.setAlignment(Pos.CENTER);


    }

    public Button getStartButton() {
        return startButton;
    }

    public TextField getPlayer1TextField() {
        return player1TextField;
    }

    public TextField getPlayer2TextField() {
        return player2TextField;
    }
}