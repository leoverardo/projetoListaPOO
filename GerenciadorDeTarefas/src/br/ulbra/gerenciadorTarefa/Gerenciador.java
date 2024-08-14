package br.ulbra.gerenciadorTarefa;

import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JOptionPane;

public class Gerenciador {
    private ArrayList tarefas;

    public Gerenciador() {
        tarefas =new ArrayList();
    }
    public void adicionar(String tarefa){
        if(tarefa.equals("") || tarefa.equals(" ")){
            JOptionPane.showMessageDialog(null, "Insira uma tarefa");
        }else {
            tarefas.add(tarefa);
            JOptionPane.showMessageDialog(null, tarefa+" Adicionada!");
        }
    }
    public void editar(int i, String editTarefa){
        if(tarefas.isEmpty()){
            JOptionPane.showMessageDialog(null, "Nenhuma Tarefa Disponivel!");
        }else if(i>=tarefas.size() || i<0){
            JOptionPane.showMessageDialog(null, "Tarefa inexistente!");
        }else{
            tarefas.set(i, editTarefa);
            JOptionPane.showMessageDialog(null, "Tarefa editada!!");
        }
    }
    public void remover(int i){
        if(tarefas.isEmpty()){
            JOptionPane.showMessageDialog(null, "Nenhuma Tarefa Disponivel para Remoção!");
        }else if(i>=tarefas.size() || i<0){
            JOptionPane.showMessageDialog(null, "Tarefa inexistente para Remoção");
        }else{
            tarefas.remove(i);
            JOptionPane.showMessageDialog(null, "Tarefa "+(i+1)+ " Removida!");
        }
    }
    public String visualizar(){
        String vizTarefa="";
        if(tarefas.isEmpty()){
            return "Não foi inserida nenhum tarefa";
        }else{
            for(int i=0;i<tarefas.size();i++){
                 vizTarefa+=(i+1)+" - "+tarefas.get(i)+"\n";
            }
        }
        return vizTarefa;
    }
    public void listaVazia(){
        if(tarefas.isEmpty()){
            JOptionPane.showMessageDialog(null, "A lista de tarefas está Vazia!");
        }else{
            JOptionPane.showMessageDialog(null, "A lista contém tarefas!");
        }
    }
    public void QuantidadeTarefas(){
        JOptionPane.showMessageDialog(null, tarefas.size()+" Tarefas");
}
    public void ordenarTarefas(){
       Collections.sort(tarefas);
}
    public void limparTarefas(){
        tarefas.clear();
    }
    public void priorizar(){
       int tarefa= Integer.parseInt(JOptionPane.showInputDialog("Informe a tarefa que deseja priorizar: "))-1;
       String tarefaPriorizada = (String)tarefas.get(tarefa);
       int posicao = Integer.parseInt(JOptionPane.showInputDialog("Informe a posição que deseja colocar a tarefa: "))-1;
       String tarefaPosicao= (String ) tarefas.get(posicao);
       tarefas.set(tarefa, tarefaPosicao);
       tarefas.set(posicao, tarefaPriorizada);
    }
}

