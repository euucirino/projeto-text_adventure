package comandos;

import model.Item;

import java.util.ArrayList;
import java.util.List;

public class Comando {
    private List<Item> inventory;
    private List<Item> itensCena;

    public Comando(List<Item> inventario, List<Item> itensCena) {
        this.inventory = inventario;
        this.itensCena = itensCena;
    }

    public Comando(ArrayList<Item> inventario) {
    }

    public void processarComando(String comando) {
        String[] partes = comando.split(" ");
        String acao = partes[0];

        switch (acao.toUpperCase()) {
            case "USE":
                usarItem(partes);
                break;
            case "GET":
                pegarItem(partes);
                break;
            case "INVENTORY":
                mostrarInventario();
                break;
            case "HELP":
                mostrarHelp();
                break;
            case "CHECK":
                verificarCena();
                break;
            case "RESTART":
                reiniciarJogo();
                break;
            default:
                System.out.println("Comando errado");
                break;
        }
    }

    private void usarItem(String[] partes) {
        if (partes.length < 2) {
            System.out.println("Você precisa especificar um item para usar.");
            return;
        }

        String nomeItem = partes[1];
        Item item = encontrarItemPorNome(nomeItem);

        if (item != null && inventory.contains(item)) {
            System.out.println("Você usou: " + item.getNome());
        } else {
            System.out.println("Item não encontrado no inventário.");
        }
    }

    private void pegarItem(String[] partes) {
        if (partes.length < 2) {
            System.out.println("Você precisa especificar um item para pegar.");
            return;
        }

        String nomeItem = partes[1];
        Item item = encontrarItemPorNome(nomeItem);

        if (item != null) {
            if (inventory.contains(item)) {
                System.out.println("Você já possui: " + item.getNome());
            } else {
                inventory.add(item);
                itensCena.remove(item);
                System.out.println("Você pegou: " + item.getNome());
            }
        } else {
            System.out.println("Item não encontrado na cena.");
        }
    }

    private Item encontrarItemPorNome(String nome) {
        for (Item item : itensCena) {
            if (item.getNome().equalsIgnoreCase(nome)) {
                return item;
            }
        }
        return null;
    }

    private void mostrarInventario() {
        System.out.println("Itens no inventário:");
        for (Item item : inventory) {
            System.out.println("- " + item.getNome());
        }
    }

    private void mostrarHelp() {
        System.out.println("Comandos disponíveis:");
        System.out.println("- USE [item]: Usa um item do inventário.");
        System.out.println("- GET [item]: Pega um item da cena.");
        System.out.println("- INVENTORY: Mostra os itens que você possui.");
        System.out.println("- CHECK: Verifica a descrição da cena atual.");
        System.out.println("- RESTART: Reinicia o jogo.");
    }

    private void verificarCena() {
        System.out.println("Descrição da cena:");
        
    }

    private void reiniciarJogo() {
        inventory.clear(); 
        itensCena.clear();
        System.out.println("O jogo foi reiniciado.");
    }
}