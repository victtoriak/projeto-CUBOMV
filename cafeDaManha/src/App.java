

import java.util.ArrayList;


import App.lista;



public class App {
    public static void main(String[] args) throws Exception {
        
        ArrayList<lista> Colaborador = new ArrayList<>();
        
        Colaborador.add (new lista("Victtoria", "01314808478", "pão de queijo\n"));

        Colaborador.add (new lista("Italo", "10995701407", "Café e pão frânces\n"));

        Colaborador.add (new lista("Silvania", "77048172487", "Bolo de rolo\n"));

        Colaborador.add (new lista("Ian Gael", "62458531415", "Queijo e presunto\n"));

        Colaborador.add (new lista("Vinicius", "06031871459", "Manteiga, requeijão e torradas\n"));

        Colaborador.add (new lista("Julia", "12345678410", "leite e açúcar\n"));

        Colaborador.add (new lista("Edvaldo", "10536624410", "Suco de laranja e acerola\n"));
        
        System.out.println(Colaborador);
    }
 
    
    
    
}
