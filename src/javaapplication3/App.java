/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;
import java.util.Scanner;
public class App {
    public void run(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("sssss");
        String repeat = "r";
        int operation;
        do{
            System.out.println("Выбрать операцию");
            System.out.println("1. Создать книгу");
            System.out.println("2. Создать читателя");
            System.out.println("3. Читатель отдает книгу");
            System.out.println("4. Читатель возвращает книгу");
            operation = scanner.nextInt();
            scanner.nextLine();
            switch (operation) {
                case 1:
                    
                    break;
                case 2:
                    
                    break;
                case 3:
                    
                    break;
                case 4:
                    
                    break;                    
                default:
                    System.out.println("Введите число от 1 до 4");
                    continue;
            }
            
            System.out.println("FOR USING PROGRAM");
            System.out.println("ENTER \"r\"");
            System.out.println("FOR QUIT ENTER \"q\"");
            repeat = scanner.nextLine();
        }while ("r".equals(repeat));
        System.out.println("END");
    }
    
}
