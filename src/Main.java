/*Creare una classe Student che accetti nel costruttore il parametro
name (String e age Int)
In questa classe avere i metodi pubblici per ottenere le informazioni.
Creare un ArrayList con 12 elementi e stamparlo in console.
Mettere in ordine la collezione e stampare il risultato*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Student student1 = new Student("Annalisa",22);
        Student student2 = new Student("pippo" , 21);
        Student student3 = new Student("Genoveffo" , 29);
        Student student4 = new Student("Carlo" , 29);
        Student student5 = new Student("Ignazio", 21);
        Student student6 = new Student("Stefano" , 23);
        Student student7 = new Student("Anastasia" ,30);
        Student student8 = new Student("Fabiola" , 33);
        Student student9 = new Student("GiacomoAntonia" , 24);
        Student student10 = new Student("Franco" , 39);
        Student student11= new Student("Ubaldo", 77);
        Student student12 = new Student("Giacomino" , 55);

        List<Student> lista1 = new ArrayList<>(Arrays.asList(student1 , student2 , student3 ,student4 ,student5 ,student6 ,student7 ,student10 ,student8 ,student9 ,student12 ,student11));
       // System.out.println("Lista studenti totali non ordinata =" + lista1);

        lista1.sort(Comparator.comparing(Student::getNome));

        System.out.println("Lista ordinata =" + lista1);

            }
        }

