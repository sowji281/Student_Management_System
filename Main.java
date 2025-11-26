package com.jdbc.program;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Student dao = new Student();

        while (true) {

            System.out.println("\n===== Student Management System =====");
            System.out.println("1. Insert Data");
            System.out.println("2. Update Data");
            System.out.println("3. Delete Data");
            System.out.println("4. Show Data");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            sc.nextLine(); // clear buffer

            switch (choice) {

                case 1:
                    System.out.print("Enter name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter age: ");
                    int age = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter grade: ");
                    String grade = sc.nextLine();

                    dao.insertStudent(name, age, grade);
                    break;

                case 2:
                    System.out.print("Enter student ID to update: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter new name: ");
                    name = sc.nextLine();

                    System.out.print("Enter new age: ");
                    age = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter new grade: ");
                    grade = sc.nextLine();

                    dao.updateStudent(id, name, age, grade);
                    break;

                case 3:
                    System.out.print("Enter student ID to delete: ");
                    int deleteId = sc.nextInt();
                    dao.deleteStudent(deleteId);
                    break;

                case 4:
                    dao.showStudents();
                    break;

                case 5:
                    System.out.println("Exiting program...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}

