package com.stepiz62.marsExplorers;

import org.joty.workstation.gui.DataAccessDialog;
import org.joty.workstation.gui.DataAccessPanel;
import org.joty.workstation.gui.Factory;

public class ValuedCandidatesDialog extends DataAccessDialog {
	public ValuedCandidatesDialog() {
		super(null, null);
		m_btnClose.setLocation(274, 5);
		m_btnHome.setLocation(240, 5);
		m_btnSave.setLocation(67, 5);
		m_btnDelete.setLocation(120, 5);
		m_btnCancel.setLocation(82, 5);
		m_btnEditOrNew.setLocation(48, 5);
		m_btnNew.setLocation(10, 5);
		m_btnNext.setLocation(187, 5);
		m_btnPrevious.setLocation(158, 5);
		m_btnSelect.setBounds(558, 339, 28, 28);
		m_buttonPane.setBounds(2, 205, 312, 37);
		m_contentPanel.setBounds(2, 2, 312, 204);
		DataAccessPanel dataAccessPanel = Factory.addDataAccessPanel(m_contentPanel, new ValuedCandidatesPanel(), "valuedcandidate", "Select a.*, b.FirstName, b.LastName from valuedcandidate a inner join candidate b on a.ExtID = b.ID");
		dataAccessPanel.setBounds(1, 1, 307, 202);
		m_contentPanel.add(dataAccessPanel);
		getContentPane().setLayout(null);
		setBounds(1, 1, 321, 271);
		m_isViewer = true;
	}

	@Override
	protected void setEntityName() {
		m_entityName = "ValuedCandidates";
	}

}
