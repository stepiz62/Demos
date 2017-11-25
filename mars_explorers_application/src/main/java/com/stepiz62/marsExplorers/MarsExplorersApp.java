package com.stepiz62.marsExplorers;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JMenu;
import javax.swing.UIManager;

import org.joty.workstation.app.Application;
import org.joty.workstation.gui.DataAccessDialog; 

public class MarsExplorersApp extends Application {
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				Application app = null;
				try {
					UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
					app = new MarsExplorersApp();
					app.init("MarsExplorersApp", "1.0.2", null, null);
				} catch (Exception e) {
					e.printStackTrace();
					Application.warningMsg("Serious failure !");
					if (app.m_frame != null)
						app.m_frame.close();
				}
			}
		});
	}

	int m_reportCount = 0;

	@Override
	protected void buildAppMenuBar() {
		m_fileMenu = new JMenu("File");
		Application.addItemToMenu(m_fileMenu, "Candidates", new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				DataAccessDialog.tryCreate("CandidatesDialog");
			}
		});
		Application.addItemToMenu(m_fileMenu, "Employees", new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				DataAccessDialog.tryCreate("EmployedDialog");
			}
		});
		Application.addItemToMenu(m_fileMenu, "Valued candidates", new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				DataAccessDialog.tryCreate("ValuedCandidatesDialog");
			}
		});
		Application.addItemToMenu(m_fileMenu, "Crew", new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				DataAccessDialog.tryCreate("ComponentsDialog");
			}
		});
		Application.addItemToMenu(m_fileMenu, "Quit", new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				m_app.exit();
			}
		});
		m_menuBar.add(m_fileMenu);
		m_menuBar.add(m_authMenu);
		m_menuBar.add(m_viewMenu);
		m_menuBar.add(m_toolsMenu);
		m_menuBar.add(m_windowsMenu);
	}

}
