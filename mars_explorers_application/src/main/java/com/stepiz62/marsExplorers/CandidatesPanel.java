package com.stepiz62.marsExplorers;

import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.TransferHandler;

import org.joty.workstation.data.WField;
import org.joty.workstation.gui.*;

public class CandidatesPanel extends NavigatorPanel {

	public CandidatesPanel() {
		m_table.setBounds(11, 61, 399, 178);

		JotyTextField firstName = Factory.createText(this, "firstName", "firstName", 50);
		firstName.setBounds(68, 250, 120, 20);
		add(firstName);

		JotyTextField lastName = Factory.createText(this, "lastName", "lastName", 50);
		lastName.setBounds(68, 281, 120, 20);
		add(lastName);
		term("lastName").setMandatory();

		JotyTextField mobilephone = Factory.createText(this, "mobilephone", "mobilephone", 50);
		mobilephone.setText("");
		mobilephone.setBounds(291, 281, 120, 20);
		add(mobilephone);

		JotyTextField city = Factory.createText(this, "city", "city", 50);
		city.setBounds(68, 314, 120, 20);
		add(city);

		JotyTextField children = Factory.createNum(this, "children", "children");
		children.setBounds(137, 345, 51, 20);
		add(children);

		JLabel lblFirstName = new JLabel("First name");
		lblFirstName.setHorizontalAlignment(SwingConstants.RIGHT);
		lblFirstName.setBounds(-11, 253, 74, 14);
		add(lblFirstName);

		JLabel lblLastName = new JLabel("Last name");
		lblLastName.setHorizontalAlignment(SwingConstants.RIGHT);
		lblLastName.setBounds(3, 284, 61, 14);
		add(lblLastName);

		JLabel lblMobilePhone = new JLabel("Mobile phone");
		lblMobilePhone.setHorizontalAlignment(SwingConstants.RIGHT);
		lblMobilePhone.setBounds(186, 284, 101, 14);
		add(lblMobilePhone);

		JLabel lblCity = new JLabel("City");
		lblCity.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCity.setBounds(17, 317, 46, 14);
		add(lblCity);

		JLabel lblChildren = new JLabel("Children");
		lblChildren.setHorizontalAlignment(SwingConstants.RIGHT);
		lblChildren.setBounds(48, 348, 85, 14);
		add(lblChildren);

		JLabel lblTheFollowingIs = new JLabel("The following is the only language item (for demo purposes) :");
		lblTheFollowingIs.setHorizontalAlignment(SwingConstants.LEFT);
		lblTheFollowingIs.setBounds(12, 7, 304, 14);
		add(lblTheFollowingIs);

		JLabel lblLanguageLabel = new JLabel("language label");
		lblLanguageLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblLanguageLabel.setBounds(11, 24, 399, 14);
		lblLanguageLabel.setText(m_app.m_common.appLang("LanguageItem"));
		add(lblLanguageLabel);

		JLabel lblNavigationList = new JLabel("Navigation List");
		lblNavigationList.setBounds(13, 45, 288, 14);
		add(lblNavigationList);

		BlobComponent blobComponent = Factory.createBlobComponent(this, "curriculum", "DocObj", "pdf", "pdf files");
		blobComponent.setBounds(102, 410, 85, 24);
		add(blobComponent);

		JLabel lblPdf = new JLabel("Curriculum");
		lblPdf.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPdf.setBounds(10, 418, 89, 14);
		add(lblPdf);

		JLabel lblImage = new JLabel("Photo 1");
		lblImage.setHorizontalAlignment(SwingConstants.CENTER);
		lblImage.setBounds(231, 419, 78, 14);
		add(lblImage);

		ImageComponent imageComponent = Factory.createImageComponent(this, "photo", "Image", "ImagePreview", "jpg", "jpg files");
		imageComponent.setBounds(227, 324, 87, 85);
		add(imageComponent);
		// imageTerm("photo").setPreviewUnbuffered();

		JLabel lblImage2 = new JLabel("Photo 2");
		lblImage2.setHorizontalAlignment(SwingConstants.CENTER);
		lblImage2.setBounds(325, 419, 78, 14);
		add(lblImage2);

		ImageComponent imageComponent2 = Factory.createImageComponent(this, "photo2", "Image2", "ImagePreview2", "jpg", "jpg files");
		imageComponent2.setBounds(324, 324, 87, 85);
		add(imageComponent2);
		// imageTerm("photo2").setPreviewUnbuffered();


		JotyTextField textField = Factory.createDate(this, "DateOfBirth", "DateOfBirth");
		textField.setBounds(291, 250, 120, 20);
		add(textField);

		JLabel lblDateOfBirth = new JLabel("Date of birth");
		lblDateOfBirth.setHorizontalAlignment(SwingConstants.RIGHT);
		lblDateOfBirth.setBounds(190, 253, 96, 14);
		add(lblDateOfBirth);

		JotyTextField textField_1 = Factory.createDateTime(this, "NextEvent", "NextEvent");
		textField_1.setBounds(68, 380, 120, 20);
		add(textField_1);

		JLabel lblNextEvent = new JLabel("Next event");
		lblNextEvent.setBounds(0, 383, 64, 14);
		add(lblNextEvent);

		// .....see the org.joty.workstation.gui.Factory class or the JotyToolBox when installed in Eclipse

		// specifying the table key
		addIntegerKeyElem("ID", true, true);

		// example of permission appliance
		enableRole("Powered Users", Permission.all);
		enableRole("Limited Users", Permission.read);

		addTermToGrid("firstName", "First name");
		addTermToGrid("lastName", "Last name");
		addTermToGrid("photo", "Photo 1");
		gridCellDescriptor("photo").setIdentityRenderer(new WField.IdentityRenderer() {
			@Override
			public String render() {
				return textTerm("firstName") + " " + textTerm("lastName");
			}
		});
		addTermToGrid("photo2", "Photo 2");
		gridCellDescriptor("photo2").setIdentityRenderer(new WField.IdentityRenderer() {
			@Override
			public String render() {
				return "Second photo: " + textTerm("firstName") + " " + textTerm("lastName");
			}
		});
		new DataInsertTransferHandler(TransferHandler.COPY, TransferHandler.NONE, masterGridTable(), false);
		setAsPublisher();
	}

	@Override
	protected void setGridFormat(Table table) {
		table.m_colWidths = new int[] { 30, 30, 20, 20 };
		table.setCustomRowHeight(ImageComponent.previewHeight);
	}
	
}
