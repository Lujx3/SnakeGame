/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

import java.util.Scanner;
import javax.swing.JFrame;



public class GameFrame extends JFrame{



	GameFrame(){

		//this.setTitle("Snake Game--------------");
                
		this.add(new GamePanel());

                this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		this.setResizable(false);

		this.pack();

		this.setVisible(true);

		this.setLocationRelativeTo(null);

		

	}

}