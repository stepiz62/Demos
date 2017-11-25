package com.stepiz62.marsExplorers;

import org.joty.workstation.gui.DataAccessDialog;
import org.joty.workstation.gui.DataAccessPanel;
import org.joty.workstation.gui.Factory;

public class CandidatesDialog extends DataAccessDialog {
	public CandidatesDialog() {
		super(null, null);
		m_btnClose.setLocation(382, 4);
		m_btnHome.setLocation(348, 4);
		m_btnNext.setLocation(240, 6);
		m_btnPrevious.setLocation(211, 6);
		m_buttonPane.setSize(424, 37);
		m_buttonPane.setLocation(3, 452);
		m_contentPanel.setBounds(2, 2, 426, 446);
		DataAccessPanel panelP = Factory.addDataAccessPanel(m_contentPanel, new CandidatesPanel(), "candidate");
		panelP.setBounds(1, 1, 425, 438);
		setBounds(10, 11, 437, 521);
		m_contentPanel.add(panelP);
		getContentPane().setLayout(null);
	}

	@Override
	protected void setEntityName() {
		m_entityName = "Candidates";
	}
}
