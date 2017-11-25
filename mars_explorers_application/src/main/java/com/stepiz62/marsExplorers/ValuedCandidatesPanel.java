package com.stepiz62.marsExplorers;

import javax.swing.TransferHandler;

import org.joty.workstation.gui.Factory;
import org.joty.workstation.gui.NavigatorPanel;

public class ValuedCandidatesPanel extends NavigatorPanel {
	public ValuedCandidatesPanel() {
		m_table.setBounds(10, 11, 287, 179);

		Factory.addNumToGrid(this, null, null);
		Factory.addTextToGrid(this, "FirstName", 50, "First name");
		Factory.addTextToGrid(this, "LastName", 50, "Last name");
		// Factory.addLongNumToGrid((TermContainerPanel) this, "ExtID",
		// "ExtID");

		// m_gridColumnWidths = new int[] { 30, 400, 400, 400};
		m_gridColumnWidths = new int[] { 30, 400, 400 };
		addIntegerKeyElem("ExtID", true, true);

		enableRole("Powered Users", Permission.readWrite);
		setRowsQueuing(TransferHandler.MOVE, "ExtID", "PreviousID", "NextID", null);
		setFirstColAsPositioner();
	}
}
