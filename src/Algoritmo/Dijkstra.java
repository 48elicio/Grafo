package Algoritmo;

 
import java.io.*;
import java.util.*;
 
public class Dijkstra {
   public static Edge[] GRAPH = {
      new Edge("1 - Acesso Terminal", "2 - Biblioteca", 5),
      new Edge("1 - Acesso Terminal", "5 - Estacionamento I", 2),
      new Edge("2 - Biblioteca", "3 - CENTAC", 2),
      new Edge("2 - Biblioteca", "6 - Blocos Antigos (A ao O)", 2),
      new Edge("2 - Biblioteca", "5 - Estacionamento I", 2),
      new Edge("2 - Biblioteca", "12 - Estacionamento II", 3),
      new Edge("2 - Biblioteca", "1 - Acesso Terminal", 5),
      new Edge("3 - CENTAC", "7 - Cantina", 1),
      new Edge("3 - CENTAC", "12 - Estacionamento II", 1),
      new Edge("3 - CENTAC", "4 - Bloco XXIA", 1),
      new Edge("3 - CENTAC", "2 - Biblioteca", 2),
      new Edge("3 - CENTAC", "6 - Blocos Antigos (A ao O)", 3),
      new Edge("4 - Bloco XXIA", "12 - Estacionamento II", 2),
      new Edge("4 - Bloco XXIA", "3 - CENTAC", 1),
      new Edge("4 - Bloco XXIA", "7 - Cantina", 1),
      new Edge("4 - Bloco XXIA", "8 - Cap", 4),
      new Edge("4 - Bloco XXIA", "9 - Ginásio", 4),
      new Edge("5 - Estacionamento I", "1 - Acesso Terminal", 2),
      new Edge("5 - Estacionamento I", "2 - Biblioteca", 2),
      new Edge("5 - Estacionamento I", "6 - Blocos Antigos (A ao O)", 3),
      new Edge("6 - Blocos Antigos (A ao O)", "5 - Estacionamento I", 3),
      new Edge("6 - Blocos Antigos (A ao O)", "2 - Biblioteca", 2),
      new Edge("6 - Blocos Antigos (A ao O)", "3 - CENTAC", 3),
      new Edge("6 - Blocos Antigos (A ao O)", "7 - Cantina", 3),
      new Edge("7 - Cantina", "6 - Blocos Antigos (A ao O)", 3),
      new Edge("7 - Cantina", "3 - CENTAC", 1),
      new Edge("7 - Cantina", "4 - Bloco XXIA", 1),
      new Edge("8 - Cap", "4 - Bloco XXIA", 4),
      new Edge("8 - Cap", "9 - Ginásio", 1),
      new Edge("9 - Ginásio", "8 - Cap", 1),
      new Edge("9 - Ginásio", "4 - Bloco XXIA", 4),
      new Edge("9 - Ginásio", "12 - Estacionamento II", 10),
      new Edge("9 - Ginásio", "11 - Blocos Novos (P, R, S)", 6),
      new Edge("9 - Ginásio", "10 - Auditório", 5),
      new Edge("10 - Auditório", "9 - Ginásio", 5),
      new Edge("10 - Auditório", "11 - Blocos Novos (P, R, S)", 2),
      new Edge("11 - Blocos Novos (P, R, S)", "9 - Ginásio", 6),
      new Edge("11 - Blocos Novos (P, R, S)", "12 - Estacionamento II", 10),
      new Edge("11 - Blocos Novos (P, R, S)", "10 - Auditório", 2),
      new Edge("12 - Estacionamento II", "2 - Biblioteca", 3),
      new Edge("12 - Estacionamento II", "3 - CENTAC", 1),
      new Edge("12 - Estacionamento II", "4 - Bloco XXIA", 2),
      new Edge("12 - Estacionamento II", "9 - Ginásio", 10),
      new Edge("12 - Estacionamento II", "11 - Blocos Novos (P, R, S)", 10),
      
   };
}