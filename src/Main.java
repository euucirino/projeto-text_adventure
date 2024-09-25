import conexao.CenaDAO;
import conexao.ItemDAO;
import conexao.SaveDAO;
import model.Cena;
import model.Item;
import model.Save;

import java.sql.SQLException;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            System.out.println("Iniciando o jogo");


            Cena cenaAtual = CenaDAO.findCenaById(1);
            System.out.println("Cena atual: " + cenaAtual);


            List<Item> itens = ItemDAO.findItensByScene(cenaAtual);
            System.out.println("Itens na cena: " + itens);


            Save save = SaveDAO.newGame();
            System.out.println("Jogo salvo: " + save);


        } catch (SQLException e) {
            System.out.println("Erro de SQL: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
            throw new RuntimeException(e);
        }
    }
}

