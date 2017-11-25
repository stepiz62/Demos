package com.stepiz62.marsExplorers;

import org.joty.workstation.gui.DataAccessDialog;
import org.joty.workstation.gui.DataAccessPanel;
import org.joty.workstation.gui.Factory;

public class EmployedDialog extends DataAccessDialog {
	public EmployedDialog() {
		super(null, null);
		m_btnClose.setLocation(394, 5);
		m_btnHome.setLocation(360, 5);
		m_btnNext.setLocation(263, 5);
		m_btnPrevious.setLocation(234, 5);
		m_btnSelect.setBounds(558, 339, 28, 28);
		m_buttonPane.setBounds(2, 157, 454, 37);
		m_contentPanel.setBounds(2, 2, 454, 155);

		DataAccessPanel dataAccessPanel = Factory.addDataAccessPanel(m_contentPanel, new EmployedPanel(), "employed", "Select a.CandidateID, b.FirstName, b.LastName from employed a inner join candidate b on a.CandidateID = b.ID");
		dataAccessPanel.setBounds(1, 1, 454, 271);
		m_contentPanel.add(dataAccessPanel);
		getContentPane().setLayout(null);
		setBounds(1, 1, 467, 227);
		m_isViewer = true;
	}

	@Override
	protected void setEntityName() {
		m_entityName = "employed";
	}
}
