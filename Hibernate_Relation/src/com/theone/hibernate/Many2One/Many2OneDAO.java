package com.theone.hibernate.Many2One;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hibernate.theone.One2Many.Customer;
import com.hibernate.theone.One2Many.Phone;
import com.theone.hibernate.One2One.Country;

public class Many2OneDAO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Configuration cfg = new Configuration();
		cfg.configure();
		
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		
		
		Transaction transaction = session.beginTransaction();
		
		Team team = new Team();
		
	  team.setTeamId(1001);
	  team.setTeamName("chennai super king");
	  
	  Player player = new Player();
	  player.setTeamId(101);
	  player.setPlayerName(" Ms Dhoni");
	  player.setTeam(team);
	  
	  Player player1 = new Player();
	  player1.setTeamId(102);
	  player1.setPlayerName("Raina");
	  player1.setTeam(team);
	  
	  session.save(player);
	  session.save(player1);
	    
	   transaction.commit();

		session.close();
		factory.close();
	}
}
