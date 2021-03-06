package simulation.frames;

import static simulation.Mainframe.*;
import java.awt.Color;
import simulation.Mainframe;
import simulation.components.ENUM_SystemType;
import simulation.components.ParticleSystem;

/**
 *
 * @author Erik
 */
public class FRAME_Setup extends javax.swing.JFrame {
	private ParticleSystem createdSystem;
	private Mainframe system;
	private boolean normalClose = false;
	
    /**
     * Creates new form FRAME_Setup
     */
    public FRAME_Setup() {
		initComponents();
		
		COMBOBOX_SystemType.removeAllItems();
		COMBOBOX_SystemType.addItem("Please select a system type");
		for(ENUM_SystemType type : ENUM_SystemType.values()){
			COMBOBOX_SystemType.addItem(String.valueOf(type));
		}
    }
	
	public FRAME_Setup(Mainframe simulationSystem){
		setTitle("Initial Settings");
		system = simulationSystem;
		initComponents();
		
		COMBOBOX_SystemType.removeAllItems();
		COMBOBOX_SystemType.addItem("Please select a system type");
		for(ENUM_SystemType type : ENUM_SystemType.values()){
			COMBOBOX_SystemType.addItem(String.valueOf(type));
		}
	}

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        LABEL_SystemSize = new javax.swing.JLabel();
        FIELD_SystemSize = new javax.swing.JTextField();
        LABEL_SimulationLength = new javax.swing.JLabel();
        FIELD_SimulationLength = new javax.swing.JTextField();
        LABEL_DesiredVirial = new javax.swing.JLabel();
        FIELD_DesiredVirial = new javax.swing.JTextField();
        LABEL_SystemType = new javax.swing.JLabel();
        COMBOBOX_SystemType = new javax.swing.JComboBox();
        LABEL_ActualVirial = new javax.swing.JLabel();
        LABEL_TimeInterval = new javax.swing.JLabel();
        FIELD_TimeInterval = new javax.swing.JTextField();
        BUTTON_Create = new javax.swing.JButton();
        BUTTON_Start = new javax.swing.JButton();
        FIELD_ActualVirial = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(357, 188));
        setMinimumSize(new java.awt.Dimension(357, 188));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Simulation Setup");

        LABEL_SystemSize.setLabelFor(FIELD_SystemSize);
        LABEL_SystemSize.setText("Particle System Size:");

        FIELD_SystemSize.setText("0");
        FIELD_SystemSize.setToolTipText("The number of particles desired in the simulated system. Integer value required.");

        LABEL_SimulationLength.setText("Simulation Length:");

        FIELD_SimulationLength.setText("0");
        FIELD_SimulationLength.setToolTipText("Length in characteristic times that the system will simulate for.");

        LABEL_DesiredVirial.setLabelFor(FIELD_DesiredVirial);
        LABEL_DesiredVirial.setText("Virial Ratio:");

        FIELD_DesiredVirial.setText("1.0");
        FIELD_DesiredVirial.setToolTipText("Desired virial ratio for the system as a decimal.");

        LABEL_SystemType.setLabelFor(COMBOBOX_SystemType);
        LABEL_SystemType.setText("System Type:");

        COMBOBOX_SystemType.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        COMBOBOX_SystemType.setToolTipText("The general shape of the system desired.");

        LABEL_ActualVirial.setLabelFor(FIELD_ActualVirial);
        LABEL_ActualVirial.setText("Actual Virial Ratio: ");

        LABEL_TimeInterval.setLabelFor(FIELD_TimeInterval);
        LABEL_TimeInterval.setText("Characteristic Time Interval:");

        FIELD_TimeInterval.setText("0.1");
        FIELD_TimeInterval.setToolTipText("Number of characteristic times between the events where the data of all simulated particles is recorded.");

        BUTTON_Create.setText("Create");
        BUTTON_Create.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BUTTON_CreateActionPerformed(evt);
            }
        });

        BUTTON_Start.setText("Start");
        BUTTON_Start.setEnabled(false);
        BUTTON_Start.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BUTTON_StartActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(LABEL_TimeInterval)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(FIELD_TimeInterval, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(14, 14, 14))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(LABEL_DesiredVirial, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(LABEL_SystemSize, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(FIELD_DesiredVirial, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(LABEL_ActualVirial))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(FIELD_SystemSize, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(LABEL_SimulationLength, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(FIELD_SimulationLength)
                            .addComponent(FIELD_ActualVirial, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(LABEL_SystemType)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(BUTTON_Create)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BUTTON_Start))
                            .addComponent(COMBOBOX_SystemType, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LABEL_SystemSize, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FIELD_SystemSize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LABEL_SimulationLength, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(FIELD_SimulationLength, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LABEL_ActualVirial, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(LABEL_DesiredVirial, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(FIELD_DesiredVirial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(FIELD_ActualVirial, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LABEL_TimeInterval)
                    .addComponent(FIELD_TimeInterval, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LABEL_SystemType)
                    .addComponent(COMBOBOX_SystemType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BUTTON_Create)
                    .addComponent(BUTTON_Start))
                .addGap(9, 9, 9))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BUTTON_CreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BUTTON_CreateActionPerformed
		//Verify formatting of input
		boolean valid = true;
		int size = 0, length = 0;
		double interval = 0.0, virial = 0.0;
		ENUM_SystemType type = null;
		try{//Check simulation size input
			size = Integer.parseInt(FIELD_SystemSize.getText().trim());
			FIELD_SystemSize.setBackground(Color.WHITE);
		} catch(NumberFormatException e){
			FIELD_SystemSize.setBackground(Color.red);
			valid = false;
		}
		
		try{//Check simulation length input
			length = Integer.parseInt(FIELD_SimulationLength.getText().trim());
			FIELD_SimulationLength.setBackground(Color.WHITE);
		} catch (NumberFormatException e){
			FIELD_SimulationLength.setBackground(Color.red);
			valid = false;
		}
		
		try{//Check time interval input
			interval = Double.parseDouble(FIELD_TimeInterval.getText().trim());
			FIELD_TimeInterval.setBackground(Color.WHITE);
		} catch (NumberFormatException e){
			FIELD_TimeInterval.setBackground(Color.red);
			valid = false;
		}
		
		try{//Check virial ratio input
			virial = Double.parseDouble(FIELD_DesiredVirial.getText().trim());
			FIELD_DesiredVirial.setBackground(Color.WHITE);
		} catch (NumberFormatException e){
			FIELD_DesiredVirial.setBackground(Color.red);
			FIELD_ActualVirial.setText("");
			valid = false;
		}
		
		try{
			type = ENUM_SystemType.valueOf(String.valueOf(COMBOBOX_SystemType.getSelectedItem()));
			COMBOBOX_SystemType.setBackground(Color.WHITE);
		} catch (Exception e){
			COMBOBOX_SystemType.setBackground(Color.red);
			valid = false;
		}
		
		if(valid){
			logHeader();
			dataLog("Creating system for simulation.");
			BUTTON_Create.setText("Recreate");
			BUTTON_Start.setEnabled(true);
			createdSystem = new ParticleSystem(size, length, interval, virial, type, system);
			FIELD_ActualVirial.setText(((float) createdSystem.getVirialRatio()) + "");
			logFooter();
		} else {
			BUTTON_Start.setEnabled(false);
		}
    }//GEN-LAST:event_BUTTON_CreateActionPerformed

	/**
	 * Sets the system in Mainframe and starts the simulation.
	 * @param evt 
	 */
    private void BUTTON_StartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BUTTON_StartActionPerformed
        setTitle("Simulating...");
		system.setSystem(createdSystem);
		system.simulate();
		setTitle("Initial Settings");
    }//GEN-LAST:event_BUTTON_StartActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
		system.exit(0);
    }//GEN-LAST:event_formWindowClosing

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
	/* Set the Nimbus look and feel */
	//<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
	 * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
	 */
	try {
	    for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
		if ("Nimbus".equals(info.getName())) {
		    javax.swing.UIManager.setLookAndFeel(info.getClassName());
		    break;
		}
	    }
	} catch (ClassNotFoundException ex) {
	    java.util.logging.Logger.getLogger(FRAME_Setup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	} catch (InstantiationException ex) {
	    java.util.logging.Logger.getLogger(FRAME_Setup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	} catch (IllegalAccessException ex) {
	    java.util.logging.Logger.getLogger(FRAME_Setup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	} catch (javax.swing.UnsupportedLookAndFeelException ex) {
	    java.util.logging.Logger.getLogger(FRAME_Setup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	}
	//</editor-fold>

	/* Create and display the form */
	java.awt.EventQueue.invokeLater(new Runnable() {
	    public void run() {
		new FRAME_Setup().setVisible(true);
	    }
	});
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BUTTON_Create;
    private javax.swing.JButton BUTTON_Start;
    private javax.swing.JComboBox COMBOBOX_SystemType;
    private javax.swing.JLabel FIELD_ActualVirial;
    private javax.swing.JTextField FIELD_DesiredVirial;
    private javax.swing.JTextField FIELD_SimulationLength;
    private javax.swing.JTextField FIELD_SystemSize;
    private javax.swing.JTextField FIELD_TimeInterval;
    private javax.swing.JLabel LABEL_ActualVirial;
    private javax.swing.JLabel LABEL_DesiredVirial;
    private javax.swing.JLabel LABEL_SimulationLength;
    private javax.swing.JLabel LABEL_SystemSize;
    private javax.swing.JLabel LABEL_SystemType;
    private javax.swing.JLabel LABEL_TimeInterval;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
