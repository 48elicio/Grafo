package Algoritmo;

 
import Grafico.Graph;
import java.io.*;
import java.util.*;
 
public class Dijkstra {
   public static Graph.Edge[] GRAPH = {
      new Graph.Edge("1 - Acesso Terminal", "2 - Biblioteca", 5),
      new Graph.Edge("1 - Acesso Terminal", "5 - Estacionamento I", 2),
      new Graph.Edge("2 - Biblioteca", "3 - CENTAC", 2),
      new Graph.Edge("2 - Biblioteca", "6 - Blocos Antigos (A ao O)", 10),
      new Graph.Edge("2 - Biblioteca", "5 - Estacionamento I", 2),
      new Graph.Edge("2 - Biblioteca", "12 - Estacionamento II", 3),
      new Graph.Edge("2 - Biblioteca", "1 - Acesso Terminal", 5),
      new Graph.Edge("3 - CENTAC", "7 - Cantina", 3),
      new Graph.Edge("3 - CENTAC", "12 - Estacionamento II", 1),
      new Graph.Edge("3 - CENTAC", "4 - Bloco XXIA", 1),
      new Graph.Edge("3 - CENTAC", "2 - Biblioteca", 2),
      new Graph.Edge("3 - CENTAC", "6 - Blocos Antigos (A ao O)", 3),
      new Graph.Edge("4 - Bloco XXIA", "12 - Estacionamento II", 2),
      new Graph.Edge("4 - Bloco XXIA", "3 - CENTAC", 1),
      new Graph.Edge("4 - Bloco XXIA", "7 - Cantina", 1),
      new Graph.Edge("4 - Bloco XXIA", "8 - Cap", 1),
      new Graph.Edge("4 - Bloco XXIA", "9 - Ginásio", 1),
      new Graph.Edge("5 - Estacionamento I", "1 - Acesso Terminal", 2),
      new Graph.Edge("5 - Estacionamento I", "2 - Biblioteca", 2),
      new Graph.Edge("5 - Estacionamento I", "6 - Blocos Antigos (A ao O)", 3),
      new Graph.Edge("6 - Blocos Antigos (A ao O)", "5 - Estacionamento I", 3),
      new Graph.Edge("6 - Blocos Antigos (A ao O)", "2 - Biblioteca", 2),
      new Graph.Edge("6 - Blocos Antigos (A ao O)", "3 - CENTAC", 2),
      new Graph.Edge("6 - Blocos Antigos (A ao O)", "7 - Cantina", 3),
      new Graph.Edge("7 - Cantina", "6 - Blocos Antigos (A ao O)", 3),
      new Graph.Edge("7 - Cantina", "3 - CENTAC", 1),
      new Graph.Edge("7 - Cantina", "4 - Bloco XXIA", 1),
      new Graph.Edge("8 - Cap", "4 - Bloco XXIA", 4),
      new Graph.Edge("8 - Cap", "9 - Ginasio", 1),
      new Graph.Edge("9 - Ginasio", "8 - Cap", 1),
      new Graph.Edge("9 - Ginasio", "4 - Bloco XXIA", 4),
      new Graph.Edge("9 - Ginasio", "12 - Estacionamento II", 10),
      new Graph.Edge("9 - Ginasio", "11 - Blocos Novos (P, R, S)", 6),
      new Graph.Edge("9 - Ginasio", "10 - Auditorio", 5),
      new Graph.Edge("10 - Auditorio", "9 - Ginasio", 5),
      new Graph.Edge("10 - Auditorio", "11 - Blocos Novos (P, R, S)", 2),
      new Graph.Edge("11 - Blocos Novos (P, R, S)", "9 - Ginasio", 6),
      new Graph.Edge("11 - Blocos Novos (P, R, S)", "12 - Estacionamento II", 10),
      new Graph.Edge("11 - Blocos Novos (P, R, S)", "10 - Auditorio", 2),
      new Graph.Edge("12 - Estacionamento II", "2 - Biblioteca", 3),
      new Graph.Edge("12 - Estacionamento II", "3 - CENTAC", 1),
      new Graph.Edge("12 - Estacionamento II", "4 - Bloco XXIA", 2),
      new Graph.Edge("12 - Estacionamento II", "9 - Ginasio", 10),
      new Graph.Edge("12 - Estacionamento II", "11 - Blocos Novos (P, R, S)", 10),
      
   };
   public static String START = "1 - Acesso Terminal";
   public static String END = "4 - Bloco XXIA";
 
}