package com.stepiz62.marsExplorers;

import javax.swing.TransferHandler;

import org.joty.workstation.gui.DataInsertTransferHandler;
import org.joty.workstation.gui.Factory;
import org.joty.workstation.gui.NavigatorPanel;
import org.joty.workstation.gui.Table;

public class EmployedPanel extends NavigatorPanel {
	public EmployedPanel() {
		m_table.setBounds(10, 11, 430, 131);

		Factory.addTextToGrid(this, "FirstName", 50, "First name");
		Factory.addTextToGrid(this, "LastName", 50, "Last name");

		addIntegerKeyElem("CandidateID", true, true);

		enableRole("Powered Users", Permission.readWrite);

		new DataInsertTransferHandler(TransferHandler.COPY_OR_MOVE, TransferHandler.COPY, (Table) getGridManager().getListComponent(), true);
		subscribe("CandidatesDialog");

	}

}
