package ru.mirea.lab02var3;

import java.lang.*;

public class Book {
    class Authtor {
        private String name = "Default";
        private String surname = "Default";
        public Authtor () {}
        public Authtor (String name, String surname) {
            this.name = name;
            this.surname = surname;
        }
        public void set (String name, String surname) {
            this.name = name;
            this.surname = surname;
        }
        public String getName () {
            return name;
        }
        public String getSurname () {
            return surname;
        }
    }
    class Name {
        private String bookname;
        public Name () {}
        public Name (String bookname) {
            this.bookname = bookname;
        }
        public void set (String bookname) {
            this.bookname = bookname;
        }
        public String getName () {
            return bookname;
        }
    }
    class Year {
        private  int year;
        public Year () {}
        public Year (int year) {
            this.year = year;
        }
        public void setYear (int year) {
            this.year = year;
        }
        public int getYear () {
            return year;
        }
    }
    Authtor authtor = new Authtor();
    Name name = new Name();
    Year year = new Year();
    public Book () {};
    public Book (Name name, Authtor authtor, Year year) {
        this.name = name;
        this.authtor = authtor;
        this.year = year;
    }
}
