/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Commands;

/**
 *
 * @author DannySuarez
 */
public class JoinCommand extends Command{
    private String username;

    public JoinCommand(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }
    
    
    
    
}
