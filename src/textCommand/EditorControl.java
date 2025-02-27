package textCommand;

import java.util.Stack;

public class EditorControl {
    private Stack<Command> comandos;

    public EditorControl() {
        this.comandos = new Stack<>();
    }

    public void ejecutarComandos(Command command){
        this.comandos.push(command);
        command.ejecutar();

    }

    public void deshacer(){
        if (!comandos.isEmpty()){
            Command command = comandos.pop();
            command.deshacer();
        }else{
            System.out.println("No hay ninguna accion para deshacer");
        }
    }

}
