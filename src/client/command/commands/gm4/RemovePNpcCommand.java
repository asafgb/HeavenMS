/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client.command.commands.gm4;

import client.MapleCharacter;
import client.MapleClient;
import client.command.Command;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import server.life.MapleLifeFactory;
import server.life.MapleNPC;
import tools.DatabaseConnection;
import tools.MaplePacketCreator;

/**
 *
 * @author asafgb
 */
public class RemovePNpcCommand extends Command {
    {
        setDescription("");
    }

    @Override
    public void execute(MapleClient c, String[] params) {
        

    }
}
