package com.example.cliente.cli;

import java.util.List;
import java.util.Scanner;

import com.example.cliente.db.entity.Role;
import com.example.cliente.db.entity.Utente;
import com.example.cliente.db.service.RoleService;
import com.example.cliente.db.service.UtenteService;

public class CliManager {

    private Scanner sc;
    private UtenteService utenteService;
    private RoleService roleService;

    public CliManager(UtenteService utenteService) {
        sc = new Scanner(System.in);
        this.utenteService = utenteService;

        printOptions();
    }

    private void printOptions() {
        System.out.println("Operazioni:");
        System.out.println("1. Mostra tabella");
        System.out.println("2. Salva un nuovo utente");
        System.out.println("3. Modificare i dettagli di un utente");
        System.out.println("4. Elimina un utente");
        System.out.println("5. Trovare tutti gli utenti con nome che inizia per A");
        System.out.println("6. Trovare tutti gli utenti con credito superiore ai 10 euro");
        System.out.println("7. Trovare tutti gli utenti con nome o cognome NULL");
        System.out.println("8. Trovare tutti gli utenti con credito positivo ma inferiore ai 10 euro");
        System.out.println("9. Esci");

        String strNum = sc.nextLine();
        int num = Integer.parseInt(strNum);

        switch (num) {

            case 1:
            readAll();
                break;
            case 2:
                insert();
                break;
            case 3:
                edit();
                break;
            case 4:
            delete();
                break;
            case 5:
            findA();
            break;
            case 6:
            findTen();
            case 7:
            findNull();
            case 8:
            findLessTen();
            case 9:
                return;
            default:
                System.out.println("Operazione non valida");
                return;
        }
        printOptions();
    }

    private void readAll() {
        List<Utente> utenti = utenteService.findAll();
        System.out.println("Utenti:");
        System.out.println(utenti);
        System.out.println("----------------------------------------");
    }

    private void insert() {
        Utente u = new Utente();
        
        System.out.println("nome:");
        String nome = sc.nextLine();
        u.setNome(nome);

        System.out.println("cognome:");
        String cognome = sc.nextLine();
        u.setCognome(cognome);

        System.out.println("username:");
        String username = sc.nextLine();
        u.setUsername(username);

        System.out.println("password:");
        String password = sc.nextLine();
        u.setPassword(password);

        System.out.println("credito:");
        String strCredito = sc.nextLine();
        int credito = Integer.parseInt(strCredito);
        u.setCredito(credito * 100);

        utenteService.save(u);
    }

    public void edit() {
        System.out.print("Modifica l'id:");
        String strId = sc.nextLine();
        Long id = Long.parseLong(strId);
        Utente u = utenteService.findById(id);

        if (u == null) {
            System.out.println("Utente non trovato");
            return;
        }

        System.out.println("nome:");
        String nome = sc.nextLine();
        u.setNome(nome);

        System.out.println("cognome:");
        String cognome = sc.nextLine();
        u.setCognome(cognome);

        System.out.println("username:");
        String username = sc.nextLine();
        u.setUsername(username);

        System.out.println("password:");
        String password = sc.nextLine();
        u.setPassword(password);

        System.out.println("credito:");
        String strCredito = sc.nextLine();
        int credito = Integer.parseInt(strCredito);
        u.setCredito(credito);

        printRoles();
        System.out.println("role id:");
        Role role = roleService.findById(sc.nextLong());
        u.setRole(role);
        sc.nextLine();

        utenteService.save(u);
        System.out.println("Utente salvato");
    }

    private void printRoles() {
        System.out.println("Ruoli disponibili");
        System.out.println(roleService.findAll());
        System.out.println();
    }

    public void delete() {
        System.out.print("Cancella l'id:");
        String strId = sc.nextLine();
        Long id = Long.parseLong(strId);
        Utente u = utenteService.findById(id);

        if (u != null) {
            System.out.println("L'utente è stato cancellato");
        } else
            System.out.println("Utente non trovato");
        }

    public void findA() {

        System.out.println(utenteService.findByNomeStartingWithA());

    }

    public void findTen() {
        System.out.println(utenteService.findByCreditoGreaterThan10());
    }

    public void findNull() {
        System.out.println(utenteService.findByNomeNullOrCognomeNull());
    }

    public void findLessTen() {
        System.out.println(utenteService.findByCreditoBetween0And10());
    }
    }
