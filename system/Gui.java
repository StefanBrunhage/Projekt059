package system;

import java.util.ArrayList;
import java.util.Collections;

import javax.swing.ButtonGroup;
import javax.swing.JTable;

/**
 *
 * @author Projekt059
 */
public class Gui extends javax.swing.JFrame {
	
	Logik logik = new Logik();
	
    public Gui() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        jInternalFrame1 = new javax.swing.JInternalFrame();
        KundH_jTabbedPane_HvdPanel = new javax.swing.JTabbedPane();
        KundH_jPanel_HvdPanel = new javax.swing.JPanel();
        KundH_jScrollPane_Tabell = new javax.swing.JScrollPane();
        KundH_jTable_Tabell = new javax.swing.JTable();
        jLabel15 = new javax.swing.JLabel();
        KundH_jComboBox_SortInfo = new javax.swing.JComboBox();
        KundH_jButton_HamtaInfo = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        KundH_jButton_Rens = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        KundH_jTextField_RaderaK = new javax.swing.JTextField();
        KundH_jButton_RaderaK = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        KundH_jTextField_HamtaInfo = new javax.swing.JTextField();
        KundH_jButton_FyllFalt = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        KundH_jRadioButton_Add = new javax.swing.JRadioButton();
        KundH_jRadioButton_Edit = new javax.swing.JRadioButton();
        KundH_jTextField_Epost = new javax.swing.JTextField();
        KundH_jButton_Exekvera = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        KundH_jTextField_PNr = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        KundH_jTextField_FNamn = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        KundH_jTextField_Roll = new javax.swing.JTextField();
        KundH_jTextField_ENamn = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        KundH_jTextField_TeleNr = new javax.swing.JTextField();
        KundH_jButton_SokButt = new javax.swing.JButton();
        KundH_jTextField_SokField = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel44 = new javax.swing.JLabel();
        LanH_jComboBox_SortInfo = new javax.swing.JComboBox();
        LanH_jButton_SortInfo = new javax.swing.JButton();
        jLabel45 = new javax.swing.JLabel();
        LanH_jTextField_Sokfield = new javax.swing.JTextField();
        LanH_jButton_SokButt = new javax.swing.JButton();
        jLabel46 = new javax.swing.JLabel();
        LanH_jButton_RensButt = new javax.swing.JButton();
        jLabel47 = new javax.swing.JLabel();
        LanH_jTextField_RaderaLan = new javax.swing.JTextField();
        LanH_jButton_RaderaLanButt = new javax.swing.JButton();
        jLabel48 = new javax.swing.JLabel();
        LanH_jTextField_HamtaInfo = new javax.swing.JTextField();
        LanH_jButton_HamtaInfo = new javax.swing.JButton();
        LanH_jRadioButton_Edit = new javax.swing.JRadioButton();
        LanH_jRadioButton_Add = new javax.swing.JRadioButton();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        LanH_jTextField_LanID = new javax.swing.JTextField();
        jLabel51 = new javax.swing.JLabel();
        LanH_jTextField_Slutdatum = new javax.swing.JTextField();
        LanH_jButton_Exekvera = new javax.swing.JButton();
        LanH_jTextField_BokID = new javax.swing.JTextField();
        jLabel52 = new javax.swing.JLabel();
        LanH_jTextField_PrsnNr = new javax.swing.JTextField();
        jLabel53 = new javax.swing.JLabel();
        LanH_jScrollPane_Tabell = new javax.swing.JScrollPane();
        LanH_jTable_Tabell = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        BokH_jRadioButton_Edit = new javax.swing.JRadioButton();
        BokH_jButton_SortInfo = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        BokH_jTable_Tabell = new javax.swing.JTable();
        BokH_jTextField_ID = new javax.swing.JTextField();
        BokH_jTextField_UtgivAr = new javax.swing.JTextField();
        BokH_jTextField_Titel = new javax.swing.JTextField();
        BokH_jTextField_Tillgang = new javax.swing.JTextField();
        BokH_jTextField_Forfattare = new javax.swing.JTextField();
        BokH_jTextField_KopB = new javax.swing.JTextField();
        BokH_jTextField_Sprak = new javax.swing.JTextField();
        BokH_jTextField_ISBN = new javax.swing.JTextField();
        BokH_jButton_Exekvera = new javax.swing.JButton();
        BokH_jComboBox_SortInfo = new javax.swing.JComboBox();
        BokH_jRadioButton_Add = new javax.swing.JRadioButton();
        BokH_jTextField_RaderaLitt = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        BokH_jButton_RaderaLitt = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        BokH_jTextField_HamtaLitt = new javax.swing.JTextField();
        BokH_jButton_HamtaInfo = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        BokH_jButton_Rens = new javax.swing.JButton();
        BokH_jTextField_SokField = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        BokH_jButton_SokButt = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel30 = new javax.swing.JLabel();
        SkuldH_jComboBox_SortInfo = new javax.swing.JComboBox();
        SkuldH_jButton_SortInfo = new javax.swing.JButton();
        jLabel31 = new javax.swing.JLabel();
        SkuldH_jButton_Rens = new javax.swing.JButton();
        jLabel32 = new javax.swing.JLabel();
        SkuldH_jTextField_SokField = new javax.swing.JTextField();
        SkuldH_jButton_SokButt = new javax.swing.JButton();
        jLabel33 = new javax.swing.JLabel();
        SkuldH_jTextField_RaderaSkuld = new javax.swing.JTextField();
        SkuldH_jButton_RaderaSkuld = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        SkuldH_jTable_Tabell = new javax.swing.JTable();
        SkuldH_jButton_HamtaInfo = new javax.swing.JButton();
        SkuldH_jTextField_HamtaInfo = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        jButton18 = new javax.swing.JButton();
        SkuldH_jTextField_SDatum = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        SkuldH_jRadioButton_Edit = new javax.swing.JRadioButton();
        SkuldH_jRadioButton_Add = new javax.swing.JRadioButton();
        SkuldH_jTextField_SkuldID = new javax.swing.JTextField();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        SkuldH_jTextField_LanID = new javax.swing.JTextField();
        jLabel39 = new javax.swing.JLabel();
        SkuldH_jTextField_Belopp = new javax.swing.JTextField();
        SkuldH_jTextField_PersNum = new javax.swing.JTextField();
        jLabel42 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jInternalFrame1.setTitle("Test_anstalld");
        jInternalFrame1.setVisible(true);

        KundH_jTable_Tabell.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Personnummer", "Förnamn", "Efternamn", "Telenummer", "Epost", "Roll"
            }
        ));
        KundH_jTable_Tabell.setColumnSelectionAllowed(true);
        KundH_jScrollPane_Tabell.setViewportView(KundH_jTable_Tabell);
        KundH_jTable_Tabell.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        
        
        jLabel15.setText("Sortera information");

        KundH_jComboBox_SortInfo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "PersNr", "Namn", "Tele", "Epost", "Adress" }));

        KundH_jButton_HamtaInfo.setText("Hämta Info");

        jLabel16.setText("Rensa tabell");

        KundH_jButton_Rens.setText("Rensta tabell");
        KundH_jButton_Rens.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KundH_jButton_RensActionPerformed(evt);
                
                for(int i = 0; i < KundH_jTable_Tabell.getRowCount(); i++){
                	for(int x = 0; x < KundH_jTable_Tabell.getColumnCount(); x++){
                		KundH_jTable_Tabell.setValueAt("", i, x);
                	}
                }
            }
        });

        jLabel17.setText("Radera Kund efter ID");

        KundH_jTextField_RaderaK.setText("Skriv in ID");


        KundH_jButton_RaderaK.setText("Ta bort");
        
        KundH_jButton_RaderaK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	KundH_jButton_RaderaKActionPerformed(evt);
            	
            	int pnr = Integer.parseInt(KundH_jTextField_RaderaK.getText());
            	logik.delPerson(pnr);
            	KundH_jTextField_RaderaK.setText("");
            }
        });

        jLabel18.setText("Hämta information");

        KundH_jTextField_HamtaInfo.setText("Skriv in ID");
        
              
        KundH_jButton_HamtaInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	
            	KundH_jButton_HamtaInfoActionPerformed(evt);
            	ArrayList<String> person = new ArrayList<>();
            	person = logik.listPerson();
            	String[] personData = new String[KundH_jTable_Tabell.getColumnCount()];
            	String[][] getPersons = new String[KundH_jTable_Tabell.getRowCount()][KundH_jTable_Tabell.getColumnCount()];
            	
            	for(int i = 0; i < person.size(); i++){
            		personData = person.get(i).split(" ");
            		
            		for(int x = 0; x < KundH_jTable_Tabell.getColumnCount(); x++){
            			getPersons[i][x] = personData[x];
            		}
            		
            		for(int x = 0; x < 6; x++){
            			KundH_jTable_Tabell.setValueAt(getPersons[i][x], i, x);
            			
            		}
            	}
            	
            }
        });
        
        KundH_jButton_FyllFalt.setText("Fyll fält");

        jLabel19.setText("Lägg till eller Ändra Kund");

        KundH_jRadioButton_Add.setText("Add");
        
        KundH_jRadioButton_Edit.setText("Edit");
        
        ButtonGroup KHButtonGroup = new ButtonGroup();
        KHButtonGroup.add(KundH_jRadioButton_Add);
        KHButtonGroup.add(KundH_jRadioButton_Edit);
        
        KundH_jRadioButton_Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KundH_jRadioButton_AddActionPerformed(evt);
            }
        });

        KundH_jTextField_Epost.setText("Epost");

        KundH_jButton_Exekvera.setText("Exekvera");
        
        KundH_jButton_Exekvera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	KundH_jButton_ExekveraActionPerformed(evt);
            	if(KundH_jRadioButton_Add.isSelected()==true){
                	if(Integer.parseInt(KundH_jTextField_Roll.getText())==1){
                		ArrayList<Integer> behorigheter = new ArrayList<>();
                		Anstalld anstalld = new Anstalld(Integer.parseInt(KundH_jTextField_PNr.getText()),KundH_jTextField_FNamn.getText(),KundH_jTextField_ENamn.getText(),
                				KundH_jTextField_TeleNr.getText(), KundH_jTextField_Epost.getText(), behorigheter);
                		
                		logik.regPerson(anstalld);
                	}
                	
                	KundH_jButton_ExekveraActionPerformed(evt);
                	if(Integer.parseInt(KundH_jTextField_Roll.getText())==2){
                		ArrayList<Integer> behorigheter = new ArrayList<>();
                		Kund kund = new Kund(Integer.parseInt(KundH_jTextField_PNr.getText()),KundH_jTextField_FNamn.getText(),KundH_jTextField_ENamn.getText(),
                				KundH_jTextField_TeleNr.getText(), KundH_jTextField_Epost.getText(), behorigheter);
                		
                		logik.regPerson(kund);
            	}
                	KundH_jTextField_PNr.setText("");
                	KundH_jTextField_FNamn.setText("");
                	KundH_jTextField_ENamn.setText("");
                	KundH_jTextField_TeleNr.setText("");
                	KundH_jTextField_Epost.setText("");
                	KundH_jTextField_Roll.setText("");
            	}
            	


            	
            }
        });

        jLabel20.setText("E-post");

        KundH_jTextField_PNr.setText("PersonNr");
        KundH_jTextField_PNr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KundH_jTextField_PNrActionPerformed(evt);
            }
        });

        jLabel21.setText("PersonNummer");

        jLabel22.setText("Förnamn");

        KundH_jTextField_FNamn.setText("Förnamn");
        KundH_jTextField_FNamn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KundH_jTextField_FNamnActionPerformed(evt);
            }
        });

        jLabel23.setText("Roll");

        KundH_jTextField_Roll.setText("Roll");

        KundH_jTextField_ENamn.setText("Efternamn");

        jLabel25.setText("Efternamn");

        jLabel26.setText("TelefonNr");

        KundH_jTextField_TeleNr.setText("TeleNr");

        KundH_jButton_SokButt.setText("Sök efter Personnummer");
        KundH_jButton_SokButt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KundH_jButton_SokButtActionPerformed(evt);
                
                for(int i = 0; i < KundH_jTable_Tabell.getRowCount(); i++){
                	for(int x = 0; x < KundH_jTable_Tabell.getColumnCount(); x++){
                		KundH_jTable_Tabell.setValueAt("", i, x);
                	}
                }
                
                ArrayList<String> personData = new ArrayList<>();
                personData = logik.getPerson(Integer.parseInt(KundH_jTextField_SokField.getText()));
            	String[] personDataSplit = new String[KundH_jTable_Tabell.getColumnCount()];
            	String[][] getPersons = new String[KundH_jTable_Tabell.getRowCount()][KundH_jTable_Tabell.getColumnCount()];
            	for(int i = 0; i < personData.size(); i++){
            		personDataSplit = personData.get(i).split(" ");
            		
            		for(int x = 0; x < KundH_jTable_Tabell.getColumnCount(); x++){
            			getPersons[i][x] = personDataSplit[x];
            		}
            		
            		for(int x = 0; x < KundH_jTable_Tabell.getColumnCount(); x++){
            			KundH_jTable_Tabell.setValueAt(getPersons[i][x], i, x);
            			
            		}
            		
            	}
                
            }
        });

        KundH_jTextField_SokField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KundH_jTextField_SokFieldActionPerformed(evt);
            }
        });

        jLabel29.setText("Sökfunktion");

        javax.swing.GroupLayout KundH_jPanel_HvdPanelLayout = new javax.swing.GroupLayout(KundH_jPanel_HvdPanel);
        KundH_jPanel_HvdPanel.setLayout(KundH_jPanel_HvdPanelLayout);
        KundH_jPanel_HvdPanelLayout.setHorizontalGroup(
            KundH_jPanel_HvdPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, KundH_jPanel_HvdPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(KundH_jPanel_HvdPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel18)
                    .addComponent(KundH_jTextField_HamtaInfo)
                    .addComponent(KundH_jButton_FyllFalt)
                    .addComponent(jLabel16)
                    .addComponent(jLabel15)
                    .addComponent(KundH_jTextField_RaderaK, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel29)
                    .addComponent(KundH_jTextField_SokField, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(KundH_jButton_SokButt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(KundH_jButton_Rens, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(KundH_jButton_HamtaInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(KundH_jButton_RaderaK, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(KundH_jComboBox_SortInfo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(KundH_jPanel_HvdPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(KundH_jScrollPane_Tabell, javax.swing.GroupLayout.PREFERRED_SIZE, 857, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19)
                    .addGroup(KundH_jPanel_HvdPanelLayout.createSequentialGroup()
                        .addGroup(KundH_jPanel_HvdPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(KundH_jRadioButton_Add)
                            .addComponent(KundH_jRadioButton_Edit))
                        .addGap(18, 18, 18)
                        .addGroup(KundH_jPanel_HvdPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(KundH_jPanel_HvdPanelLayout.createSequentialGroup()
                                .addGroup(KundH_jPanel_HvdPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, KundH_jPanel_HvdPanelLayout.createSequentialGroup()
                                        .addGroup(KundH_jPanel_HvdPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(KundH_jTextField_PNr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel21))
                                        .addGap(40, 40, 40))
                                    .addGroup(KundH_jPanel_HvdPanelLayout.createSequentialGroup()
                                        .addGroup(KundH_jPanel_HvdPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel20)
                                            .addComponent(KundH_jTextField_Epost, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(62, 62, 62)))
                                .addGroup(KundH_jPanel_HvdPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(KundH_jTextField_FNamn)
                                    .addComponent(jLabel22)
                                    .addComponent(jLabel23)
                                    .addComponent(KundH_jTextField_Roll))
                                .addGap(70, 70, 70)
                                .addGroup(KundH_jPanel_HvdPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(KundH_jTextField_ENamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel25))
                                .addGap(49, 49, 49)
                                .addGroup(KundH_jPanel_HvdPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(KundH_jTextField_TeleNr)))
                            .addComponent(KundH_jButton_Exekvera))))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        KundH_jPanel_HvdPanelLayout.setVerticalGroup(
            KundH_jPanel_HvdPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(KundH_jPanel_HvdPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(KundH_jPanel_HvdPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(KundH_jPanel_HvdPanelLayout.createSequentialGroup()
                        .addComponent(KundH_jComboBox_SortInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(KundH_jButton_HamtaInfo)
                        .addGap(45, 45, 45)
                        .addComponent(jLabel29)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(KundH_jTextField_SokField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(KundH_jButton_SokButt)
                        .addGap(45, 45, 45)
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(KundH_jButton_Rens)
                        .addGap(43, 43, 43)
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(KundH_jTextField_RaderaK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(KundH_jScrollPane_Tabell, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(KundH_jPanel_HvdPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(KundH_jPanel_HvdPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(KundH_jButton_RaderaK)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel18)
                        .addGap(3, 3, 3)
                        .addComponent(KundH_jTextField_HamtaInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(KundH_jButton_FyllFalt))
                    .addGroup(KundH_jPanel_HvdPanelLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(KundH_jPanel_HvdPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(KundH_jPanel_HvdPanelLayout.createSequentialGroup()
                                .addComponent(jLabel19)
                                .addGap(18, 18, 18)
                                .addGroup(KundH_jPanel_HvdPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel21)
                                    .addComponent(jLabel22)
                                    .addComponent(jLabel25)
                                    .addComponent(jLabel26))
                                .addGap(3, 3, 3)
                                .addGroup(KundH_jPanel_HvdPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(KundH_jPanel_HvdPanelLayout.createSequentialGroup()
                                        .addGroup(KundH_jPanel_HvdPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(KundH_jPanel_HvdPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(KundH_jRadioButton_Add)
                                                .addComponent(KundH_jTextField_PNr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(KundH_jTextField_FNamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(13, 13, 13)
                                        .addComponent(jLabel20)
                                        .addGap(2, 2, 2)
                                        .addGroup(KundH_jPanel_HvdPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(KundH_jTextField_Epost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(KundH_jRadioButton_Edit)
                                            .addComponent(KundH_jTextField_Roll, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(KundH_jTextField_ENamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(KundH_jTextField_TeleNr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(KundH_jPanel_HvdPanelLayout.createSequentialGroup()
                                .addComponent(jLabel23)
                                .addGap(22, 22, 22)))
                        .addComponent(KundH_jButton_Exekvera)))
                .addContainerGap(110, Short.MAX_VALUE))
        );

        KundH_jTabbedPane_HvdPanel.addTab("Kundhantering", KundH_jPanel_HvdPanel);

        jLabel44.setText("Sortera information");

        LanH_jComboBox_SortInfo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "LånID", "PersonNr", "Titel", "BokID" }));

        LanH_jButton_SortInfo.setText("Hämta Information");

        jLabel45.setText("Sökfunktion");

        LanH_jTextField_Sokfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LanH_jTextField_SokfieldActionPerformed(evt);
            }
        });

        LanH_jButton_SokButt.setText("Sök");
        LanH_jButton_SokButt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LanH_jButton_SokButtActionPerformed(evt);
            }
        });

        jLabel46.setText("Rensa tabell");

        LanH_jButton_RensButt.setText("Rensa tabell");
        LanH_jButton_RensButt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LanH_jButton_RensButtActionPerformed(evt);
                for(int i = 0; i < LanH_jTable_Tabell.getRowCount(); i++){
                	for(int x = 0; x < LanH_jTable_Tabell.getColumnCount(); x++){
                		LanH_jTable_Tabell.setValueAt("", i, x);
                	}
                }	
            }
        });

        jLabel47.setText("Radera Lån efter ID");

        LanH_jTextField_RaderaLan.setText("Skriv in ID");
        LanH_jTextField_RaderaLan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LanH_jTextField_RaderaLanActionPerformed(evt);
            }
        });

        LanH_jButton_RaderaLanButt.setText("Ta bort");
        
        LanH_jButton_RaderaLanButt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	LanH_jButton_RaderaLanButtActionPerformed(evt);
            	
            	logik.delLon(Integer.parseInt(LanH_jTextField_RaderaLan.getText()));
            	LanH_jTextField_RaderaLan.setText("");
            }
        });

        jLabel48.setText("Hämta information");

        LanH_jTextField_HamtaInfo.setText("Skriv in ID");

        LanH_jButton_HamtaInfo.setText("Fyll fält");
        
        LanH_jButton_SortInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	LanH_jButton_SortInfoActionPerformed(evt);
            	
                for(int i = 0; i < LanH_jTable_Tabell.getRowCount(); i++){
                	for(int x = 0; x < LanH_jTable_Tabell.getColumnCount(); x++){
                		LanH_jTable_Tabell.setValueAt("", i, x);
                	}
                }	
            	
            	ArrayList<String> lon = new ArrayList<>();
            	System.out.println(lon.size());
            	lon = logik.listLonBok();
            	System.out.println(lon.size());
            	String[] lonData = new String[LanH_jTable_Tabell.getColumnCount()];
            	String[][] getLon = new String[LanH_jTable_Tabell.getRowCount()][LanH_jTable_Tabell.getColumnCount()];
            	for(int i = 0; i < lon.size(); i++){
            		lonData = lon.get(i).split(" ");
            		
            		getLon[i][0] = lonData[0];
            		getLon[i][1] = lonData[1];
            		getLon[i][2] = lonData[2].replace(".", " ");
            		getLon[i][3] = lonData[3];
            		
            		for(int x = 0; x < LanH_jTable_Tabell.getColumnCount(); x++){
            			LanH_jTable_Tabell.setValueAt(getLon[i][x], i, x);
            		}
            	}
            }
        });

        LanH_jRadioButton_Edit.setText("Edit");

        LanH_jRadioButton_Add.setText("Add");
        
        ButtonGroup LanHButtonGroup = new ButtonGroup();
        LanHButtonGroup.add(LanH_jRadioButton_Add);
        LanHButtonGroup.add(LanH_jRadioButton_Edit);
        
        LanH_jRadioButton_Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LanH_jRadioButton_AddActionPerformed(evt);
            }
        });

        jLabel49.setText("Lägg till eller Ändra Lån");

        jLabel50.setText("LånID");

        LanH_jTextField_LanID.setText("LanID");

        jLabel51.setText("Slutdatum");

        LanH_jTextField_Slutdatum.setText("Slutdatum");

        LanH_jButton_Exekvera.setText("Exekvera");
        
        LanH_jButton_Exekvera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	LanH_jButton_ExekveraActionPerformed(evt);
            		ArrayList<Integer> bokId = new ArrayList<>();
            		bokId.add(Integer.parseInt(LanH_jTextField_BokID.getText()));
            		Lon lon = new Lon(Integer.parseInt(LanH_jTextField_LanID.getText()), bokId,Integer.parseInt(LanH_jTextField_PrsnNr.getText()), 
            				LanH_jTextField_Slutdatum.getText());
            		
            		logik.regLon(lon);
            	
            }
        });

        LanH_jTextField_BokID.setText("BokId");

        jLabel52.setText("BokID");

        LanH_jTextField_PrsnNr.setText("PersonNr");
        LanH_jTextField_PrsnNr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LanH_jTextField_PrsnNrActionPerformed(evt);
            }
        });

        jLabel53.setText("PersonNr");

        LanH_jTable_Tabell.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        LanH_jTable_Tabell.setColumnSelectionAllowed(true);
        LanH_jScrollPane_Tabell.setViewportView(LanH_jTable_Tabell);
        LanH_jTable_Tabell.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LanH_jButton_SortInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(LanH_jButton_SokButt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(LanH_jButton_RaderaLanButt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(LanH_jButton_RensButt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel47)
                            .addComponent(jLabel45)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel44, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(LanH_jComboBox_SortInfo, javax.swing.GroupLayout.Alignment.LEADING, 0, 0, Short.MAX_VALUE))
                            .addComponent(LanH_jTextField_Sokfield, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LanH_jTextField_RaderaLan, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel46)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel48, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(LanH_jTextField_HamtaInfo, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(LanH_jButton_HamtaInfo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LanH_jScrollPane_Tabell, javax.swing.GroupLayout.PREFERRED_SIZE, 853, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel49)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(LanH_jRadioButton_Add)
                            .addComponent(LanH_jRadioButton_Edit))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(jPanel4Layout.createSequentialGroup()
                                            .addComponent(jLabel51)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 79, Short.MAX_VALUE))
                                        .addGroup(jPanel4Layout.createSequentialGroup()
                                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(LanH_jTextField_Slutdatum)
                                                .addComponent(LanH_jTextField_LanID))
                                            .addGap(31, 31, 31)))
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(jLabel50)
                                        .addGap(71, 71, 71)))
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel53)
                                    .addComponent(LanH_jTextField_PrsnNr)
                                    .addComponent(jLabel52)
                                    .addComponent(LanH_jTextField_BokID)))
                            .addComponent(LanH_jButton_Exekvera))))
                .addGap(81, 81, 81))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel44)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(LanH_jComboBox_SortInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(LanH_jButton_SortInfo)
                        .addGap(34, 34, 34)
                        .addComponent(jLabel45)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LanH_jTextField_Sokfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LanH_jButton_SokButt)
                        .addGap(35, 35, 35)
                        .addComponent(jLabel46)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LanH_jButton_RensButt)
                        .addGap(36, 36, 36)
                        .addComponent(jLabel47)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LanH_jTextField_RaderaLan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LanH_jButton_RaderaLanButt))
                    .addComponent(LanH_jScrollPane_Tabell, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel48)
                        .addGap(3, 3, 3)
                        .addComponent(LanH_jTextField_HamtaInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LanH_jButton_HamtaInfo))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel49)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel50)
                                .addGap(3, 3, 3))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel53)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LanH_jRadioButton_Add, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(LanH_jTextField_LanID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(LanH_jTextField_PrsnNr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(13, 13, 13)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel51)
                            .addComponent(jLabel52))
                        .addGap(2, 2, 2)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LanH_jTextField_Slutdatum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LanH_jRadioButton_Edit)
                            .addComponent(LanH_jTextField_BokID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(LanH_jButton_Exekvera)))
                .addContainerGap(92, Short.MAX_VALUE))
        );

        KundH_jTabbedPane_HvdPanel.addTab("Lånhantering", jPanel4);

        BokH_jRadioButton_Edit.setText("Edit");

        BokH_jButton_SortInfo.setText("Hämta Information");
        
        BokH_jButton_SortInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	BokH_jButton_SortInfoActionPerformed(evt);
            	
            	ArrayList<String> bok = new ArrayList<>();
            	bok = logik.listLitt();
            	String[] bokData = new String[BokH_jTable_Tabell.getColumnCount()];
            	String[][] getBok = new String[BokH_jTable_Tabell.getRowCount()][BokH_jTable_Tabell.getColumnCount()];
            	for(int i = 0; i < bok.size(); i++){
            		bokData = bok.get(i).split(" ");
            		
            		for(int x = 0; x < BokH_jTable_Tabell.getColumnCount();x++){
            			getBok[i][x] = bokData[x].replace(".", " ");
            		}
            		
            		for(int x = 0; x < 8; x++){
            			BokH_jTable_Tabell.setValueAt(getBok[i][x], i, x);
            		}
            	}
            }
        });

        BokH_jTable_Tabell.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7", "Title 8"
            }
        ));
        BokH_jTable_Tabell.setColumnSelectionAllowed(true);
        jScrollPane1.setViewportView(BokH_jTable_Tabell);
        BokH_jTable_Tabell.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        BokH_jTextField_ID.setText("ID");

        BokH_jTextField_UtgivAr.setText("Utgivningsår");

        BokH_jTextField_Titel.setText("Titel");
        BokH_jTextField_Titel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BokH_jTextField_TitelActionPerformed(evt);
            }
        });

        BokH_jTextField_Tillgang.setText("Tillgänglighet");

        BokH_jTextField_Forfattare.setText("Författare");

        BokH_jTextField_KopB.setText("Kopieringsbart");

        BokH_jTextField_Sprak.setText("Språk");

        BokH_jTextField_ISBN.setText("ISBN");

        BokH_jButton_Exekvera.setText("Exekvera");
        
        BokH_jButton_Exekvera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	 BokH_jButton_ExekveraActionPerformed(evt);
            	 
            	 
            	 Litteratur litteratur = new Litteratur(Integer.parseInt(BokH_jTextField_ID.getText()), BokH_jTextField_Titel.getText().replace(" ", "."), 
            			 BokH_jTextField_Forfattare.getText().replace(" ", "."), BokH_jTextField_Sprak.getText(),
            			 Integer.parseInt(BokH_jTextField_UtgivAr.getText()), Boolean.parseBoolean(BokH_jTextField_Tillgang.getText()),
            			 Boolean.parseBoolean(BokH_jTextField_KopB.getText()), BokH_jTextField_ISBN.getText());
            	 
            	 logik.regLitt(litteratur);
            	 
            }
        });

        BokH_jComboBox_SortInfo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Id", "Titel", "Författare", "Språk", "Utgivningsår", "Tillgänglig", "ISBN", "Kopieringsbart" }));

        BokH_jRadioButton_Add.setText("Add");
        BokH_jRadioButton_Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BokH_jRadioButton_AddActionPerformed(evt);
            }
        });
        
        ButtonGroup BokHButtonGroup = new ButtonGroup();
        BokHButtonGroup.add( BokH_jRadioButton_Add);
        BokHButtonGroup.add( BokH_jRadioButton_Edit);

        BokH_jTextField_RaderaLitt.setText("Skriv in ID");


        jLabel1.setText("Radera Litteratur efter ID");

        BokH_jButton_RaderaLitt.setText("Ta bort");
        
        BokH_jButton_RaderaLitt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	BokH_jButton_RaderaLittActionPerformed(evt);
            	
            	int bokId = Integer.parseInt(BokH_jTextField_RaderaLitt.getText());
            	logik.delLitt(bokId);
            	BokH_jTextField_RaderaLitt.setText("");
            }
        });

        jLabel2.setText("Sortera information");

        BokH_jTextField_HamtaLitt.setText("Skriv in ID");

        BokH_jButton_HamtaInfo.setText("Fyll fält");

        jLabel4.setText("Hämta information");

        jLabel3.setText("Lägg till eller Ändra bok");

        jLabel5.setText("Titel");

        jLabel6.setText("Utgivningsår");

        jLabel7.setText("ISBN");

        jLabel8.setText("Tillgänglig");

        jLabel9.setText("Författare");

        jLabel10.setText("Kopieringsbart");

        jLabel11.setText("ID");

        jLabel12.setText("Språk");

        jLabel14.setText("Rensa tabell");

        BokH_jButton_Rens.setText("Rensa tabell");
        BokH_jButton_Rens.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BokH_jButton_RensActionPerformed(evt);
                
                for(int i = 0; i < BokH_jTable_Tabell.getRowCount(); i++){
                	for(int x = 0; x < BokH_jTable_Tabell.getColumnCount(); x++){
                		BokH_jTable_Tabell.setValueAt("", i, x);
                	}
                }
            }
        });

        BokH_jTextField_SokField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BokH_jTextField_SokFieldActionPerformed(evt);
            }
        });

        jLabel28.setText("Sökfunktion");

        BokH_jButton_SokButt.setText("Sök");
        BokH_jButton_SokButt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BokH_jButton_SokButtActionPerformed(evt);
                
                for(int i = 0; i < BokH_jTable_Tabell.getRowCount(); i++){
                	for(int x = 0; x < BokH_jTable_Tabell.getColumnCount(); x++){
                		BokH_jTable_Tabell.setValueAt("", i, x);
                	}
                }
                
                ArrayList<String> bokData = new ArrayList<>();
                bokData = logik.getLitt(BokH_jTextField_SokField.getText().replace(" ", "."));
            	String[] bokDataSplit = new String[BokH_jTable_Tabell.getColumnCount()];
            	String[][] getPersons = new String[BokH_jTable_Tabell.getRowCount()][BokH_jTable_Tabell.getColumnCount()];
            	for(int i = 0; i < bokData.size(); i++){
            		bokDataSplit = bokData.get(i).split(" ");
            		
            		for(int x = 0; x < BokH_jTable_Tabell.getColumnCount(); x++){
            			getPersons[i][x] = bokDataSplit[x].replace(".", " ");
            		}
            		
            		for(int x = 0; x < BokH_jTable_Tabell.getColumnCount(); x++){
            			BokH_jTable_Tabell.setValueAt(getPersons[i][x], i, x);
            			
            		}
            		
            	}
                
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BokH_jButton_SortInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BokH_jButton_SokButt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BokH_jButton_RaderaLitt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BokH_jButton_Rens, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel28)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(BokH_jComboBox_SortInfo, javax.swing.GroupLayout.Alignment.LEADING, 0, 0, Short.MAX_VALUE))
                                    .addComponent(BokH_jTextField_SokField, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(BokH_jTextField_RaderaLitt, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel14))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BokH_jTextField_HamtaLitt, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BokH_jButton_HamtaInfo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 853, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(BokH_jRadioButton_Add)
                            .addComponent(BokH_jRadioButton_Edit))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel11)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                                .addComponent(BokH_jTextField_ID)
                                                .addGap(23, 23, 23)
                                                .addComponent(BokH_jTextField_Titel, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                                        .addComponent(jLabel6)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE))
                                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                                        .addComponent(BokH_jTextField_UtgivAr)
                                                        .addGap(23, 23, 23)))
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel8)
                                                    .addComponent(BokH_jTextField_Tillgang, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addGap(41, 41, 41)))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel9)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(BokH_jTextField_KopB, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE)
                                        .addComponent(BokH_jTextField_Forfattare, javax.swing.GroupLayout.Alignment.LEADING)))
                                .addGap(41, 41, 41)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel7)
                                    .addComponent(BokH_jTextField_ISBN)
                                    .addComponent(BokH_jTextField_Sprak, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE)))
                            .addComponent(BokH_jButton_Exekvera))))
                .addGap(81, 81, 81))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(BokH_jComboBox_SortInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BokH_jButton_SortInfo)
                        .addGap(34, 34, 34)
                        .addComponent(jLabel28)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BokH_jTextField_SokField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BokH_jButton_SokButt)
                        .addGap(35, 35, 35)
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BokH_jButton_Rens)
                        .addGap(41, 41, 41)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BokH_jTextField_RaderaLitt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BokH_jButton_RaderaLitt))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(jLabel4)
                        .addGap(3, 3, 3)
                        .addComponent(BokH_jTextField_HamtaLitt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BokH_jButton_HamtaInfo))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel11))
                            .addComponent(jLabel9)
                            .addComponent(jLabel12)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BokH_jRadioButton_Add, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(BokH_jTextField_ID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(BokH_jTextField_Sprak, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(BokH_jTextField_Titel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(BokH_jTextField_Forfattare, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(13, 13, 13)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel8)
                            .addComponent(jLabel10)
                            .addComponent(jLabel7))
                        .addGap(2, 2, 2)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BokH_jTextField_UtgivAr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BokH_jRadioButton_Edit)
                            .addComponent(BokH_jTextField_ISBN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BokH_jTextField_Tillgang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BokH_jTextField_KopB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BokH_jButton_Exekvera)))
                .addContainerGap(65, Short.MAX_VALUE))
        );

        KundH_jTabbedPane_HvdPanel.addTab("Bokhantering", jPanel2);

        jLabel30.setText("Sortera information");

        SkuldH_jComboBox_SortInfo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SkuldID", "LÃ¥nID", "PersNr", "SlutDatum", "Belopp" }));

        SkuldH_jButton_SortInfo.setText("HÃ¤mta Info");

        jLabel31.setText("Rensa tabell");

        SkuldH_jButton_Rens.setText("UtfÃ¶r Rensning");
        SkuldH_jButton_Rens.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SkuldH_jButton_RensActionPerformed(evt);
            }
        });

        jLabel32.setText("SÃ¶kfunktion");

        SkuldH_jTextField_SokField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SkuldH_jTextField_SokFieldActionPerformed(evt);
            }
        });

        SkuldH_jButton_SokButt.setText("SÃ¶k");
        SkuldH_jButton_SokButt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SkuldH_jButton_SokButtActionPerformed(evt);
            }
        });

        jLabel33.setText("Radera Skuld efter ID");

        SkuldH_jTextField_RaderaSkuld.setText("Skriv in ID");
        SkuldH_jTextField_RaderaSkuld.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SkuldH_jTextField_RaderaSkuldActionPerformed(evt);
            }
        });

        SkuldH_jButton_RaderaSkuld.setText("Ta bort");

        SkuldH_jTable_Tabell.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5"
            }
        ));
        SkuldH_jTable_Tabell.setColumnSelectionAllowed(true);
        jScrollPane4.setViewportView(SkuldH_jTable_Tabell);
        SkuldH_jTable_Tabell.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        SkuldH_jButton_HamtaInfo.setText("Fyll fÃ¤lt");

        SkuldH_jTextField_HamtaInfo.setText("Skriv in ID");

        jLabel34.setText("HÃ¤mta information");

        jButton18.setText("Exekvera");

        SkuldH_jTextField_SDatum.setText("SDatum");

        jLabel35.setText("SlutDatum");

        SkuldH_jRadioButton_Edit.setText("Edit");

        SkuldH_jRadioButton_Add.setText("Add");
        SkuldH_jRadioButton_Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SkuldH_jRadioButton_AddActionPerformed(evt);
            }
        });
        
        
        ButtonGroup SkuldHButtonGroup = new ButtonGroup();
        SkuldHButtonGroup.add(SkuldH_jRadioButton_Add);
        SkuldHButtonGroup.add(SkuldH_jRadioButton_Edit);
        
        SkuldH_jTextField_SkuldID.setText("SkuldID");
        SkuldH_jTextField_SkuldID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SkuldH_jTextField_SkuldIDActionPerformed(evt);
            }
        });

        jLabel36.setText("Skuld ID");

        jLabel37.setText("LÃ¤gg till eller Ã¤ndra Skuld");

        jLabel38.setText("LÃ¥n ID");

        SkuldH_jTextField_LanID.setText("LÃ¥nID");
        SkuldH_jTextField_LanID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SkuldH_jTextField_LanIDActionPerformed(evt);
            }
        });

        jLabel39.setText("Belopp");

        SkuldH_jTextField_Belopp.setText("Belopp");

        SkuldH_jTextField_PersNum.setText("PersNum");

        jLabel42.setText("Personnummer");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel5Layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel31)
                                .addComponent(SkuldH_jTextField_RaderaSkuld, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel32)
                                .addComponent(SkuldH_jTextField_SokField, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(SkuldH_jButton_SortInfo, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
                                .addComponent(SkuldH_jButton_SokButt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel34)
                                .addComponent(SkuldH_jTextField_HamtaInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(SkuldH_jButton_HamtaInfo)
                                .addComponent(SkuldH_jComboBox_SortInfo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel30, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addComponent(jLabel33, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(SkuldH_jButton_Rens, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(SkuldH_jButton_RaderaSkuld, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 857, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel37)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(SkuldH_jRadioButton_Add)
                            .addComponent(SkuldH_jRadioButton_Edit))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(jPanel5Layout.createSequentialGroup()
                                            .addComponent(jLabel35)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE))
                                        .addGroup(jPanel5Layout.createSequentialGroup()
                                            .addComponent(SkuldH_jTextField_SDatum)
                                            .addGap(22, 22, 22)))
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel36)
                                            .addComponent(SkuldH_jTextField_SkuldID, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(22, 22, 22)))
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(jPanel5Layout.createSequentialGroup()
                                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel38)
                                                    .addComponent(jLabel39))
                                                .addGap(86, 86, 86))
                                            .addGroup(jPanel5Layout.createSequentialGroup()
                                                .addComponent(SkuldH_jTextField_LanID)
                                                .addGap(40, 40, 40)))
                                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel42)
                                            .addComponent(SkuldH_jTextField_PersNum, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(SkuldH_jTextField_Belopp, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jButton18))))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel30)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(SkuldH_jComboBox_SortInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(SkuldH_jButton_SortInfo)
                        .addGap(27, 27, 27)
                        .addComponent(jLabel32)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(SkuldH_jTextField_SokField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(SkuldH_jButton_SokButt)
                        .addGap(33, 33, 33)
                        .addComponent(jLabel31)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(SkuldH_jButton_Rens)
                        .addGap(35, 35, 35)
                        .addComponent(jLabel33)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(SkuldH_jTextField_RaderaSkuld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(SkuldH_jButton_RaderaSkuld)))
                .addGap(32, 32, 32)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel34)
                        .addGap(3, 3, 3)
                        .addComponent(SkuldH_jTextField_HamtaInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(SkuldH_jButton_HamtaInfo))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addComponent(jLabel42)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addComponent(jLabel37)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel36)
                                        .addGap(3, 3, 3)))
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(SkuldH_jRadioButton_Add, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(SkuldH_jTextField_SkuldID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(SkuldH_jTextField_PersNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel38)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(SkuldH_jTextField_LanID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(13, 13, 13)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel35)
                            .addComponent(jLabel39))
                        .addGap(2, 2, 2)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(SkuldH_jTextField_SDatum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SkuldH_jRadioButton_Edit)
                            .addComponent(SkuldH_jTextField_Belopp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton18)))
                .addContainerGap(81, Short.MAX_VALUE))
        );

        KundH_jTabbedPane_HvdPanel.addTab("Skuldhantering", jPanel5);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jInternalFrame1Layout.createSequentialGroup()
                .addComponent(KundH_jTabbedPane_HvdPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 1034, Short.MAX_VALUE)
                .addContainerGap())
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addComponent(KundH_jTabbedPane_HvdPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 680, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 741, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jInternalFrame1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jInternalFrame1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }
    
    
    
    
    
    private void LanH_jButton_RaderaLanButtActionPerformed(java.awt.event.ActionEvent evt) {
    }
    
    private void BokH_jButton_ExekveraActionPerformed(java.awt.event.ActionEvent evt) {
    }
    
    private void BokH_jButton_SortInfoActionPerformed(java.awt.event.ActionEvent evt) {
    }
    
    private void LanH_jButton_ExekveraActionPerformed(java.awt.event.ActionEvent evt) {
    }
    
    private void SkuldH_jTextField_LanIDActionPerformed(java.awt.event.ActionEvent evt) {
    }
    
    private void KundH_jButton_ExekveraActionPerformed(java.awt.event.ActionEvent evt) {
    }
    
    private void KundH_jButton_HamtaInfoActionPerformed(java.awt.event.ActionEvent evt) {
    }
     
    private void  LanH_jButton_SortInfoActionPerformed(java.awt.event.ActionEvent evt) {
    }
    
    private void SkuldH_jRadioButton_AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SkuldH_jRadioButton_AddActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SkuldH_jRadioButton_AddActionPerformed

    private void SkuldH_jTextField_RaderaSkuldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SkuldH_jTextField_RaderaSkuldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SkuldH_jTextField_RaderaSkuldActionPerformed

    private void SkuldH_jButton_SokButtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SkuldH_jButton_SokButtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SkuldH_jButton_SokButtActionPerformed

    private void SkuldH_jTextField_SokFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SkuldH_jTextField_SokFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SkuldH_jTextField_SokFieldActionPerformed

    private void SkuldH_jButton_RensActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SkuldH_jButton_RensActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SkuldH_jButton_RensActionPerformed

    private void BokH_jButton_SokButtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BokH_jButton_SokButtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BokH_jButton_SokButtActionPerformed

    private void BokH_jTextField_SokFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BokH_jTextField_SokFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BokH_jTextField_SokFieldActionPerformed

    private void BokH_jButton_RensActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BokH_jButton_RensActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BokH_jButton_RensActionPerformed

    private void BokH_jButton_RaderaLittActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BokH_jTextField_RaderaLittActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BokH_jTextField_RaderaLittActionPerformed

    private void BokH_jRadioButton_AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BokH_jRadioButton_AddActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BokH_jRadioButton_AddActionPerformed

    private void BokH_jTextField_TitelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BokH_jTextField_TitelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BokH_jTextField_TitelActionPerformed

    private void KundH_jTextField_SokFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KundH_jTextField_SokFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_KundH_jTextField_SokFieldActionPerformed

    private void KundH_jButton_SokButtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KundH_jButton_SokButtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_KundH_jButton_SokButtActionPerformed

    private void KundH_jTextField_FNamnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KundH_jTextField_FNamnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_KundH_jTextField_FNamnActionPerformed

    private void KundH_jRadioButton_AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KundH_jRadioButton_AddActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_KundH_jRadioButton_AddActionPerformed

    private void KundH_jButton_RaderaKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KundH_jTextField_RaderaKActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_KundH_jTextField_RaderaKActionPerformed

    private void KundH_jButton_RensActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KundH_jButton_RensActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_KundH_jButton_RensActionPerformed

    private void KundH_jTextField_PNrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KundH_jTextField_PNrActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_KundH_jTextField_PNrActionPerformed

    private void LanH_jTextField_PrsnNrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LanH_jTextField_PrsnNrActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LanH_jTextField_PrsnNrActionPerformed

    private void LanH_jRadioButton_AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LanH_jRadioButton_AddActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LanH_jRadioButton_AddActionPerformed

    private void LanH_jTextField_RaderaLanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LanH_jTextField_RaderaLanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LanH_jTextField_RaderaLanActionPerformed

    private void LanH_jButton_RensButtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LanH_jButton_RensButtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LanH_jButton_RensButtActionPerformed

    private void LanH_jButton_SokButtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LanH_jButton_SokButtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LanH_jButton_SokButtActionPerformed

    private void LanH_jTextField_SokfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LanH_jTextField_SokfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LanH_jTextField_SokfieldActionPerformed

    private void SkuldH_jTextField_SkuldIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SkuldH_jTextField_SkuldIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SkuldH_jTextField_SkuldIDActionPerformed


    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Gui().setVisible(true);
            }
        });
    }
    private javax.swing.JButton BokH_jButton_Exekvera;
    private javax.swing.JButton BokH_jButton_HamtaInfo;
    private javax.swing.JButton BokH_jButton_RaderaLitt;
    private javax.swing.JButton BokH_jButton_Rens;
    private javax.swing.JButton BokH_jButton_SokButt;
    private javax.swing.JButton BokH_jButton_SortInfo;
    private javax.swing.JComboBox BokH_jComboBox_SortInfo;
    private javax.swing.JRadioButton BokH_jRadioButton_Add;
    private javax.swing.JRadioButton BokH_jRadioButton_Edit;
    private javax.swing.JTextField BokH_jTextField_Forfattare;
    private javax.swing.JTextField BokH_jTextField_HamtaLitt;
    private javax.swing.JTextField BokH_jTextField_ID;
    private javax.swing.JTextField BokH_jTextField_ISBN;
    private javax.swing.JTextField BokH_jTextField_KopB;
    private javax.swing.JTextField BokH_jTextField_RaderaLitt;
    private javax.swing.JTextField BokH_jTextField_SokField;
    private javax.swing.JTextField BokH_jTextField_Sprak;
    private javax.swing.JTextField BokH_jTextField_Tillgang;
    private javax.swing.JTextField BokH_jTextField_Titel;
    private javax.swing.JTextField BokH_jTextField_UtgivAr;
    private javax.swing.JButton KundH_jButton_Exekvera;
    private javax.swing.JButton KundH_jButton_FyllFalt;
    private javax.swing.JButton KundH_jButton_HamtaInfo;
    private javax.swing.JButton KundH_jButton_RaderaK;
    private javax.swing.JButton KundH_jButton_Rens;
    private javax.swing.JButton KundH_jButton_SokButt;
    private javax.swing.JComboBox KundH_jComboBox_SortInfo;
    private javax.swing.JPanel KundH_jPanel_HvdPanel;
    private javax.swing.JRadioButton KundH_jRadioButton_Add;
    private javax.swing.JRadioButton KundH_jRadioButton_Edit;
    private javax.swing.JScrollPane KundH_jScrollPane_Tabell;
    private javax.swing.JTabbedPane KundH_jTabbedPane_HvdPanel;
    private javax.swing.JTable KundH_jTable_Tabell;
    private javax.swing.JTextField KundH_jTextField_ENamn;
    private javax.swing.JTextField KundH_jTextField_Epost;
    private javax.swing.JTextField KundH_jTextField_FNamn;
    private javax.swing.JTextField KundH_jTextField_HamtaInfo;
    private javax.swing.JTextField KundH_jTextField_PNr;
    private javax.swing.JTextField KundH_jTextField_RaderaK;
    private javax.swing.JTextField KundH_jTextField_Roll;
    private javax.swing.JTextField KundH_jTextField_SokField;
    private javax.swing.JTextField KundH_jTextField_TeleNr;
    private javax.swing.JButton LanH_jButton_Exekvera;
    private javax.swing.JButton LanH_jButton_HamtaInfo;
    private javax.swing.JButton LanH_jButton_RaderaLanButt;
    private javax.swing.JButton LanH_jButton_RensButt;
    private javax.swing.JButton LanH_jButton_SokButt;
    private javax.swing.JButton LanH_jButton_SortInfo;
    private javax.swing.JComboBox LanH_jComboBox_SortInfo;
    private javax.swing.JRadioButton LanH_jRadioButton_Add;
    private javax.swing.JRadioButton LanH_jRadioButton_Edit;
    private javax.swing.JScrollPane LanH_jScrollPane_Tabell;
    private javax.swing.JTable LanH_jTable_Tabell;
    private javax.swing.JTextField LanH_jTextField_BokID;
    private javax.swing.JTextField LanH_jTextField_HamtaInfo;
    private javax.swing.JTextField LanH_jTextField_LanID;
    private javax.swing.JTextField LanH_jTextField_PrsnNr;
    private javax.swing.JTextField LanH_jTextField_RaderaLan;
    private javax.swing.JTextField LanH_jTextField_Sokfield;
    private javax.swing.JTextField LanH_jTextField_Slutdatum;
    private javax.swing.JButton SkuldH_jButton_HamtaInfo;
    private javax.swing.JButton SkuldH_jButton_RaderaSkuld;
    private javax.swing.JButton SkuldH_jButton_Rens;
    private javax.swing.JButton SkuldH_jButton_SokButt;
    private javax.swing.JButton SkuldH_jButton_SortInfo;
    private javax.swing.JComboBox SkuldH_jComboBox_SortInfo;
    private javax.swing.JRadioButton SkuldH_jRadioButton_Add;
    private javax.swing.JRadioButton SkuldH_jRadioButton_Edit;
    private javax.swing.JTextField SkuldH_jTextField_Belopp;
    private javax.swing.JTextField SkuldH_jTextField_HamtaInfo;
    private javax.swing.JTextField SkuldH_jTextField_LanID;
    private javax.swing.JTextField SkuldH_jTextField_PersNum;
    private javax.swing.JTextField SkuldH_jTextField_RaderaSkuld;
    private javax.swing.JTextField SkuldH_jTextField_SDatum;
    private javax.swing.JTextField SkuldH_jTextField_SkuldID;
    private javax.swing.JTextField SkuldH_jTextField_SokField;
    private javax.swing.JButton jButton18;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable BokH_jTable_Tabell;
    private javax.swing.JTable SkuldH_jTable_Tabell;
}
