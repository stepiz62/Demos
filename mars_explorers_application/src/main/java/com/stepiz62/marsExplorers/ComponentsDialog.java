package com.stepiz62.marsExplorers;

import org.joty.workstation.gui.*;

public class ComponentsDialog extends DataAccessDialog {
	public ComponentsDialog() {
		super(null, null);
		m_btnClose.setLocation(399, 5);
		m_btnHome.setLocation(365, 5);
		m_btnNext.setLocation(267, 5);
		m_btnPrevious.setLocation(238, 5);
		m_buttonPane.setSize(462, 37);
		m_buttonPane.setLocation(2, 151);
		m_contentPanel.setBounds(2, 2, 462, 147);
		setBounds(1, 1, 472, 215);

		DataAccessPanel dataAccessPanel = Factory.addDataAccessPanel(m_contentPanel, new ComponentsPanel() , "shipseat", "Select a.*, b.firstName, b.lastName from shipseat a left join candidate b on a.candidateid = b.id");
		dataAccessPanel.setBounds(1, 1, 462, 237);
		m_contentPanel.add(dataAccessPanel);

		m_isViewer = true;
	}

	@Override
	protected void setEntityName() {
		m_entityName = "Crew";
	}
}
