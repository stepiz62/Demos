package com.stepiz62.marsExplorers;

import java.util.Vector;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.TransferHandler;

import org.joty.common.JotyTypes;
import org.joty.data.WrappedField;
import org.joty.workstation.data.WField;
import org.joty.workstation.gui.*;
import org.joty.workstation.gui.GridManager.IRenderAnalogicalSelector;

public class ComponentsPanel extends NavigatorPanel {
	public ComponentsPanel() {
		m_table.setBounds(153, 21, 287, 105);
		Factory.addLongNumToGrid(this, "ID", "Seat");
		Factory.addTextToGrid(this, "FirstName", 50, "First name");
		Factory.addTextToGrid(this, "LastName", 50, "Last name");
		enableRole("Powered Users", Permission.readWrite);

		addIntegerKeyElem("ID", true, true);
		addField("CandidateID", JotyTypes._long);

		DataUpdateTransferHandler transferHandler = new DataUpdateTransferHandler(TransferHandler.MOVE, TransferHandler.COPY, (Table) getGridManager().getListComponent(), true, "CandidateID");

		setSelectorsTransferHandler(new SelectorsTransferHandler(transferHandler));

		m_gridManager.m_renderAnalogicalSelector = new IRenderAnalogicalSelector() {
			int lastNameColPos = -1;

			@Override
			public void render(GridManager gridManager, int row) {
				if (lastNameColPos == -1)
					lastNameColPos = gridManager.getFieldIndex("lastName");
				Vector<WrappedField> record = gridManager.m_gridBuffer.m_records.get(row).m_data;
				gridManager.setHeavyStatus(row, !record.get(lastNameColPos).isNull());
				gridManager.renderHeavyStatus(row);
			}
		};

		Factory.m_DnDfeatures = true;

		JPanel seat1 = Factory.addAnalogicalRowSelector(this, 1);
		seat1.setBounds(29, 27, 31, 21);
		add(seat1);

		JPanel seat2 = Factory.addAnalogicalRowSelector(this, 2);
		seat2.setBounds(94, 27, 31, 21);
		add(seat2);

		JPanel seat3 = Factory.addAnalogicalRowSelector(this, 3);
		seat3.setBounds(29, 59, 31, 21);
		add(seat3);

		JPanel seat4 = Factory.addAnalogicalRowSelector(this, 4);
		seat4.setBounds(94, 59, 31, 21);
		add(seat4);

		JLabel lblSeats = new JLabel("--------- Seats ---------");
		lblSeats.setBounds(26, 11, 105, 14);
		add(lblSeats);

		JLabel label = new JLabel("1");
		label.setBounds(20, 33, 8, 14);
		add(label);

		JLabel label_1 = new JLabel("2");
		label_1.setBounds(85, 33, 8, 14);
		add(label_1);

		JLabel label_2 = new JLabel("3");
		label_2.setBounds(20, 64, 8, 14);
		add(label_2);

		JLabel label_3 = new JLabel("4");
		label_3.setBounds(85, 64, 8, 14);
		add(label_3);

	}
}
