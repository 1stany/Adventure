package org.generation.italy.adventure.model;

import static java.lang.System.exit;

public class World {
    private Room start;
    private MemoryRoomRepository roomRepo;
    private Player player;
    private UserInterface ui;
    private CommandInterpreter interpreter;

    public World(){
        this.roomRepo = new MemoryRoomRepository();
        this.start = roomRepo.getStartRoom();
        this.player = new Player("dink smallwood", start, 
        new Item(10, "straccio", "un vecchio pezzo di tela che possiamo usare per vestirci", 0.4, 0));
        this.ui = new UserInterface();
        this.interpreter = new CommandInterpreter(player);
    }

    public void start(){
        while(true){
            ui.showMessage(player.getActualRoom().toString());
            ui.showMessage(player.getActualRoom().getRoomContent());
            ui.showPrompt();
            String c = ui.readCommand(); 
            if("exit".equals(c)){
                break;
            }  
            Command command = interpreter.commandFor(c);
            String result = command.execute();
            ui.showMessage(result);
        }


        System.out.println("Fine gioco");
    }
}
