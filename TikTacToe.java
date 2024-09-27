package com.example.tiktaktoe;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

public class TikTakToe implements EventHandler<ActionEvent> {
    private HBox h1, h2, h3;
    private VBox v1;

    private Label lab1, lab2;

    private Button bt1, bt2, bt3, bt4, bt5, bt6, bt7, bt8, bt9, btR;

    private int player = 1;
    private static int times = 0;

    public int getTimes() {
        return times;
    }

    private Text t1, t2;

    public Pane getV1() {
        return v1;
    }

    public int[][] getMatrix() {
        return matrix;
    }

    private static int[][] matrix = new int[3][3];
    private boolean flag = true;


    public TikTakToe() {
        t1 = new Text("O");
        t1.setFont(Font.font(500));

        t2 = new Text("X");
        t2.setFont(Font.font(500));

        bt1 = new Button("  ");
        bt1.setOnAction(this);

        bt2 = new Button("  ");
        bt2.setOnAction(this);

        bt3 = new Button("  ");
        bt3.setOnAction(this);

        bt4 = new Button("  ");
        bt4.setOnAction(this);

        bt5 = new Button("  ");
        bt5.setOnAction(this);

        bt6 = new Button("  ");
        bt6.setOnAction(this);

        bt7 = new Button("  ");
        bt7.setOnAction(this);

        bt8 = new Button("  ");
        bt8.setOnAction(this);

        bt9 = new Button("  ");
        bt9.setOnAction(this);

        btR = new Button("Restart");
        btR.setOnAction(this);

        h1 = new HBox(bt1, bt2, bt3);
        h1.setSpacing(15);
        h1.setAlignment(Pos.TOP_CENTER);

        h2 = new HBox(bt4, bt5, bt6);
        h2.setSpacing(15);
        h2.setAlignment(Pos.CENTER);

        h3 = new HBox(bt7, bt8, bt9);
        h3.setSpacing(15);
        h3.setAlignment(Pos.BOTTOM_CENTER);

        lab1 = new Label("Welcome to Olivia's TikTakToe :) \n Have fun!");
        lab2 = new Label();

        v1 = new VBox(lab1, h1, h2, h3, lab2, btR);
        v1.setSpacing(30);
        v1.setAlignment(Pos.CENTER);
    }
    public void restart() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix[i][j] = 0;
            }
            bt1.setText("  ");
            bt2.setText("  ");
            bt3.setText("  ");
            bt4.setText("  ");
            bt5.setText("  ");
            bt6.setText("  ");
            bt7.setText("  ");
            bt8.setText("  ");
            bt9.setText("  ");
            times = 0;
            lab2.setText(" ");
            flag = true;
            player = 1;
        }

    }

    @Override
    public void handle(ActionEvent click) {
        if (click.getSource() == btR) {
            restart();
        }

        if (click.getSource() == bt1 && matrix[0][0] == 0 && flag == true) {
            times += 1;
            if (player == 1) {
                bt1.setText(t1.getText());
                matrix[0][0] = 1;
                player = 2;
            } else if (player == 2) {
                bt1.setText(t2.getText());
                matrix[0][0] = 2;
                player = 1;
            }
            winner();
        }

        if (click.getSource() == bt2 && matrix[0][1] == 0 && flag == true) {
            times += 1;
            if (player == 1) {
                bt2.setText(t1.getText());
                matrix[0][1] = 1;
                player = 2;
            } else if (player == 2) {
                bt2.setText(t2.getText());
                matrix[0][1] = 2;
                player = 1;
            }
            winner();
        }


        if (click.getSource() == bt3 && matrix[0][2] == 0 && flag == true) {
            times += 1;
            if (player == 1) {
                bt3.setText(t1.getText());
                matrix[0][2] = 1;
                player = 2;
            } else if (player == 2) {
                bt3.setText(t2.getText());
                matrix[0][2] = 2;
                player = 1;
            }
            winner();

//            if (times > 4){
//                if (res != 0)
//                    lab2.setText("Congratulation!! Player " + res + " wins!!");
//            }

//            else if (times == 9)
//                if (res == 0)
//                    lab2.setText("Wow! Both sides reached a draw!");
        }

        if (click.getSource() == bt4 && matrix[1][0] == 0 && flag == true) {
            times += 1;
            if (player == 1) {
                bt4.setText(t1.getText());
                matrix[1][0] = 1;
                player = 2;
            } else if (player == 2) {
                bt4.setText(t2.getText());
                matrix[1][0] = 2;
                player = 1;
            }
            winner();
        }

        if (click.getSource() == bt5 && matrix[1][1] == 0 && flag == true) {
            times += 1;
            if (player == 1) {
                bt5.setText(t1.getText());
                matrix[1][1] = 1;
                player = 2;
            } else if (player == 2) {
                bt5.setText(t2.getText());
                matrix[1][1] = 2;
                player = 1;
            }
            winner();
        }

        if (click.getSource() == bt6 && matrix[1][2] == 0 && flag == true) {
            times += 1;
            if (player == 1) {
                bt6.setText(t1.getText());
                matrix[1][2] = 1;
                player = 2;
            } else if (player == 2) {
                bt6.setText(t2.getText());
                matrix[1][2] = 2;
                player = 1;
            }
            winner();
        }

        if (click.getSource() == bt7 && matrix[2][0] == 0 && flag == true) {
            times += 1;
            if (player == 1) {
                bt7.setText(t1.getText());
                matrix[2][0] = 1;
                player = 2;
            } else if (player == 2) {
                bt7.setText(t2.getText());
                matrix[2][0] = 2;
                player = 1;
            }
            winner();
        }

        if (click.getSource() == bt8 && matrix[2][1] == 0 && flag == true) {
            times += 1;
            if (player == 1) {
                bt8.setText(t1.getText());
                matrix[2][1] = 1;
                player = 2;
            } else if (player == 2) {
                bt8.setText(t2.getText());
                matrix[2][1] = 2;
                player = 1;
            }
            winner();
        }

        if (click.getSource() == bt9 && matrix[2][2] == 0 && flag == true) {
            times += 1;
            if (player == 1) {
                bt9.setText(t1.getText());
                matrix[2][2] = 1;
                player = 2;
            } else if (player == 2) {
                bt9.setText(t2.getText());
                matrix[2][2] = 2;
                player = 1;
            }
            winner();
        }
    }

    public int whoIsWinning(int[][] A) {
        //checking rows
        for (int i = 0; i < A.length; i++) {
            if (A[i][0] == A[i][1] && A[i][1] == A[i][2]) {
                return A[i][0];
            }
        }
        //checking columns
        for (int i = 0; i < A.length; i++) {
            if (A[0][i] == A[1][i] && A[1][i] == A[2][i]) {
                return A[0][i];
            }
            //checking diagnols
            if (A[0][0] == A[1][1] && A[0][0] == A[2][2]) {
                return A[0][0];
            }
            if (A[0][2] == A[1][1] && A[0][2] == A[2][0]) {
                return A[0][2];
            }
        }
        return -1;
    }

    public void winner() {
        int res = whoIsWinning(matrix);
        if (times > 4) {
            if (res == 1 || res == 2) {
                flag = false;
                if(res == 1)
                    lab2.setText("Congratulation!! Player O wins!!");
                if(res == 2)
                    lab2.setText("Congratulation!! Player X wins!!");
            }
            if (times > 8 && res == -1)
                lab2.setText("Wow! Both sides reached a draw!");
        }

    }
}