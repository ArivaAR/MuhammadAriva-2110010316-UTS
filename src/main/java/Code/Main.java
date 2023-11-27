/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Code;

import java.awt.Color;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Pattern;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author ariva
 */
public class Main extends javax.swing.JFrame {

    private int nomorOtomatis = 1; // Inisialisasi nomor otomatis
    private boolean isEdit = false;
    private boolean isDarkMode = true;

    public Main() {
        initComponents();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        dataT = new javax.swing.JTable();
        cariTF = new javax.swing.JTextField();
        editBT = new javax.swing.JButton();
        hapusBT = new javax.swing.JButton();
        tandaiBT = new javax.swing.JButton();
        printBT = new javax.swing.JButton();
        importBT = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        simpanBT = new javax.swing.JButton();
        resetBT = new javax.swing.JButton();
        waktuTF = new javax.swing.JTextField();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        isiTA = new javax.swing.JTextArea();
        tanggalDP = new org.jdesktop.swingx.JXDatePicker();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(204, 255, 204));

        dataT.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No", "Tanggal", "Waktu", "Isi Agenda", "Tanda"
            }
        ));
        jScrollPane2.setViewportView(dataT);
        if (dataT.getColumnModel().getColumnCount() > 0) {
            dataT.getColumnModel().getColumn(0).setMaxWidth(30);
            dataT.getColumnModel().getColumn(1).setMaxWidth(120);
            dataT.getColumnModel().getColumn(2).setMaxWidth(50);
            dataT.getColumnModel().getColumn(4).setMaxWidth(30);
        }

        cariTF.setForeground(new java.awt.Color(153, 153, 153));
        cariTF.setText("Cari Disini");
        cariTF.setToolTipText("Cari Agenda Disini");
        cariTF.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                cariTFFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                cariTFFocusLost(evt);
            }
        });
        cariTF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cariTFKeyPressed(evt);
            }
        });

        editBT.setBackground(new java.awt.Color(204, 204, 255));
        editBT.setFont(new java.awt.Font("Bell MT", 1, 14)); // NOI18N
        editBT.setText("Edit");
        editBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editBTActionPerformed(evt);
            }
        });

        hapusBT.setBackground(new java.awt.Color(255, 204, 204));
        hapusBT.setFont(new java.awt.Font("Bell MT", 1, 14)); // NOI18N
        hapusBT.setText("Hapus");
        hapusBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hapusBTActionPerformed(evt);
            }
        });

        tandaiBT.setBackground(new java.awt.Color(255, 204, 255));
        tandaiBT.setFont(new java.awt.Font("Bell MT", 1, 14)); // NOI18N
        tandaiBT.setText("Tandai");
        tandaiBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tandaiBTActionPerformed(evt);
            }
        });

        printBT.setBackground(new java.awt.Color(204, 255, 255));
        printBT.setFont(new java.awt.Font("Bell MT", 1, 14)); // NOI18N
        printBT.setText("Export");
        printBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printBTActionPerformed(evt);
            }
        });

        importBT.setBackground(new java.awt.Color(255, 255, 204));
        importBT.setFont(new java.awt.Font("Bell MT", 1, 14)); // NOI18N
        importBT.setText("Import");
        importBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                importBTActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        jLabel6.setText("Pencarian");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 438, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(editBT, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(hapusBT, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tandaiBT))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(printBT)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cariTF, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(importBT)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(printBT)
                    .addComponent(importBT))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cariTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(editBT)
                    .addComponent(hapusBT)
                    .addComponent(tandaiBT))
                .addGap(10, 10, 10))
        );

        getContentPane().add(jPanel2, java.awt.BorderLayout.CENTER);

        jPanel1.setBackground(new java.awt.Color(153, 255, 204));
        jPanel1.setPreferredSize(new java.awt.Dimension(501, 460));

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel1.setText("Aplikasi Agenda Pribadi");

        jLabel2.setFont(new java.awt.Font("Bell MT", 1, 14)); // NOI18N
        jLabel2.setText("Tanggal");

        jLabel3.setFont(new java.awt.Font("Bell MT", 1, 14)); // NOI18N
        jLabel3.setText("Waktu");

        jLabel4.setFont(new java.awt.Font("Bell MT", 1, 14)); // NOI18N
        jLabel4.setText("Ingatkan Saya");

        jLabel5.setFont(new java.awt.Font("Bell MT", 1, 14)); // NOI18N
        jLabel5.setText("Masukkan Isi Text");

        simpanBT.setBackground(new java.awt.Color(204, 204, 255));
        simpanBT.setFont(new java.awt.Font("Bell MT", 1, 14)); // NOI18N
        simpanBT.setText("Simpan");
        simpanBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simpanBTActionPerformed(evt);
            }
        });

        resetBT.setBackground(new java.awt.Color(255, 204, 204));
        resetBT.setFont(new java.awt.Font("Bell MT", 1, 14)); // NOI18N
        resetBT.setText("Reset");
        resetBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetBTActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setFont(new java.awt.Font("Lucida Bright", 0, 14)); // NOI18N
        jRadioButton1.setText("Ya");

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setFont(new java.awt.Font("Lucida Bright", 0, 14)); // NOI18N
        jRadioButton2.setText("Tidak");

        isiTA.setColumns(20);
        isiTA.setRows(5);
        jScrollPane1.setViewportView(isiTA);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(resetBT)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 334, Short.MAX_VALUE)
                        .addComponent(simpanBT, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(108, 108, 108)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jRadioButton1)
                                .addGap(18, 18, 18)
                                .addComponent(jRadioButton2)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(waktuTF)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(68, 68, 68)
                                .addComponent(jLabel1)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(63, 63, 63)
                                .addComponent(tanggalDP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(0, 372, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tanggalDP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(waktuTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton2))
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 262, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(simpanBT, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(resetBT, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.WEST);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void printBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printBTActionPerformed
        // Mendapatkan model tabel
        DefaultTableModel model = (DefaultTableModel) dataT.getModel();

        // Mendapatkan jumlah baris dan kolom dari tabel
        int rowCount = model.getRowCount();
        int colCount = model.getColumnCount();

        // Membuat nama file
        String fileName = "agenda.txt";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            // Menulis header kolom ke dalam file
            for (int i = 0; i < colCount; i++) {
                writer.write(model.getColumnName(i));
                if (i < colCount - 1) {
                    writer.write("\t");
                } else {
                    writer.write("\n");
                }
            }

            // Menulis data dari tabel ke dalam file
            for (int i = 0; i < rowCount; i++) {
                for (int j = 0; j < colCount; j++) {
                    Object value = model.getValueAt(i, j);

                    // Check for null before invoking toString
                    if (value != null) {
                        writer.write(value.toString());
                    }

                    if (j < colCount - 1) {
                        writer.write("\t");
                    } else {
                        writer.write("\n");
                    }
                }
            }

            // Memberikan pesan berhasil
            JOptionPane.showMessageDialog(this, "Data telah berhasil dicetak ke dalam file " + fileName, "Cetak Berhasil", JOptionPane.INFORMATION_MESSAGE);
        } catch (IOException e) {
            // Menangani kesalahan IO
            JOptionPane.showMessageDialog(this, "Terjadi kesalahan saat mencetak file.", "Error", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace(); // Cetak detail kesalahan ke konsol
        }
    }//GEN-LAST:event_printBTActionPerformed

    private void resetBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetBTActionPerformed
        waktuTF.setText("");
        tanggalDP.setDate(null);
        jRadioButton1.setSelected(false);
        jRadioButton2.setSelected(false);
        isiTA.setText("");
    }//GEN-LAST:event_resetBTActionPerformed

    private void simpanBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simpanBTActionPerformed
        // Ambil nilai dari elemen input
        String tanggal = "";
        if (tanggalDP.getDate() != null) {
            // Format the date before assigning it to the tanggal variable
            SimpleDateFormat outputFormat = new SimpleDateFormat("dd/MM/yyyy");
            tanggal = outputFormat.format(tanggalDP.getDate());
        }
        String waktu = waktuTF.getText();
        String isiAgenda = isiTA.getText();

        // Cek radiobutton yang dipilih
        String tanda = jRadioButton1.isSelected() ? "*" : "";

        // Tambahkan data ke dalam tabel
        DefaultTableModel model = (DefaultTableModel) dataT.getModel();

        if (isEdit) {
            // If in edit mode, update the existing row
            int selectedRow = dataT.getSelectedRow();
            model.setValueAt(nomorOtomatis + tanda, selectedRow, 0);
            model.setValueAt(tanggal, selectedRow, 1);
            model.setValueAt(waktu, selectedRow, 2);
            model.setValueAt(isiAgenda, selectedRow, 3);
            model.setValueAt("", selectedRow, 4); // You may need to set the value for column 4 based on your logic
        } else {
            // If not in edit mode, add a new row
            int rowCount = model.getRowCount();
            int lastRowNumber = rowCount > 0 ? Integer.parseInt(model.getValueAt(rowCount - 1, 0).toString().replaceAll("[^0-9]", "")) : 0;
            nomorOtomatis = lastRowNumber + 1;

            model.addRow(new Object[]{nomorOtomatis + tanda, tanggal, waktu, isiAgenda, ""});
        }

        // Reset elemen-elemen input
        resetForm();

        // Reset the edit mode
        isEdit = false;

        jRadioButton1.setSelected(false);
        jRadioButton2.setSelected(false);

        // Reset the text and action of the button
        simpanBT.setText("Simpan");
        simpanBT.setActionCommand("simpan");
    }//GEN-LAST:event_simpanBTActionPerformed

    private void editBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editBTActionPerformed
        // Mendapatkan indeks baris yang dipilih
        int selectedRow = dataT.getSelectedRow();

        // Memastikan ada baris yang dipilih
        if (selectedRow != -1) {
            // Set the edit flag to true
            isEdit = true;

            // Mendapatkan data dari baris yang dipilih
            DefaultTableModel model = (DefaultTableModel) dataT.getModel();
            Object[] rowData = new Object[model.getColumnCount()];
            for (int i = 0; i < model.getColumnCount(); i++) {
                rowData[i] = model.getValueAt(selectedRow, i);
            }

            // Isi elemen formulir dengan data dari baris yang dipilih
            String numericPart = ((String) rowData[0]).replaceAll("[^0-9]", "");

            try {
                nomorOtomatis = Integer.parseInt(numericPart);
            } catch (NumberFormatException e) {
                // Handle the case where parsing fails, e.g., log an error or display a message
                e.printStackTrace(); // print the exception details to the console
            }

            // Format string date into Date object
            String dateString = (String) rowData[1];
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
            try {
                Date parsedDate = dateFormat.parse(dateString);
                tanggalDP.setDate(parsedDate);
            } catch (ParseException e) {
                // Handle the case where parsing fails
                JOptionPane.showMessageDialog(this, "Invalid date format.", "Error", JOptionPane.ERROR_MESSAGE);
                e.printStackTrace(); // print the exception details to the console
            }

            waktuTF.setText((String) rowData[2]);

            // Check if the No column contains "*"
            boolean isStarPresent = ((String) rowData[0]).contains("*");
            jRadioButton1.setSelected(isStarPresent);
            jRadioButton2.setSelected(!isStarPresent);

            isiTA.setText((String) rowData[3]);

            // Change the text and action of the button
            simpanBT.setText("Ubah");
            simpanBT.setActionCommand("ubah");
        } else {
            // Tampilkan pesan jika tidak ada baris yang dipilih
            JOptionPane.showMessageDialog(this, "Pilih baris untuk diedit.", "Peringatan", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_editBTActionPerformed

    private void hapusBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hapusBTActionPerformed
        // Mendapatkan indeks baris yang dipilih
        int selectedRow = dataT.getSelectedRow();

        // Memastikan ada baris yang dipilih
        if (selectedRow != -1) {
            // Konfirmasi pengguna untuk menghapus
            int confirm = JOptionPane.showConfirmDialog(this, "Apakah Anda yakin untuk menghapus baris ini?", "Konfirmasi Hapus", JOptionPane.YES_NO_OPTION);

            if (confirm == JOptionPane.YES_OPTION) {
                // Hapus baris dari tabel
                DefaultTableModel model = (DefaultTableModel) dataT.getModel();
                model.removeRow(selectedRow);

                // Reset elemen-elemen input
                resetForm();
            }
        } else {
            // Tampilkan pesan jika tidak ada baris yang dipilih
            JOptionPane.showMessageDialog(this, "Pilih baris untuk dihapus.", "Peringatan", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_hapusBTActionPerformed

    private void importBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_importBTActionPerformed
        // Membuka dialog untuk memilih file
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Pilih File untuk Import");
        int result = fileChooser.showOpenDialog(this);

        // Memeriksa apakah pengguna memilih file
        if (result == JFileChooser.APPROVE_OPTION) {
            // Mendapatkan file yang dipilih
            File selectedFile = fileChooser.getSelectedFile();

            try (BufferedReader reader = new BufferedReader(new FileReader(selectedFile))) {
                DefaultTableModel model = (DefaultTableModel) dataT.getModel();

                // Simpan lebar kolom saat ini
                int columnCount = model.getColumnCount();
                int[] columnWidths = new int[columnCount];
                for (int i = 0; i < columnCount; i++) {
                    columnWidths[i] = dataT.getColumnModel().getColumn(i).getMaxWidth();
                }

                // Membersihkan tabel sebelum menambahkan data baru
                model.setRowCount(0);

                // Membaca header kolom
                String line = reader.readLine();
                String[] columnNames = line.split("\t");

                // Menambahkan header kolom ke dalam tabel
                model.setColumnIdentifiers(columnNames);

                // Membaca data baris per baris
                while ((line = reader.readLine()) != null) {
                    String[] rowData = line.split("\t");
                    model.addRow(rowData);
                }

                // Mengembalikan lebar kolom ke nilai sebelumnya
                for (int i = 0; i < columnCount; i++) {
                    dataT.getColumnModel().getColumn(i).setMaxWidth(columnWidths[i]);
                }

                // Memberikan pesan berhasil
                JOptionPane.showMessageDialog(this, "Data berhasil diimpor dari file " + selectedFile.getName(), "Import Berhasil", JOptionPane.INFORMATION_MESSAGE);
            } catch (IOException e) {
                // Menangani kesalahan IO
                JOptionPane.showMessageDialog(this, "Terjadi kesalahan saat mengimpor file.", "Error", JOptionPane.ERROR_MESSAGE);
                e.printStackTrace(); // Cetak detail kesalahan ke konsol
            }
        }
    }//GEN-LAST:event_importBTActionPerformed

    private void cariTFKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cariTFKeyPressed
        String query = cariTF.getText();
        DefaultTableModel tableModel = (DefaultTableModel) dataT.getModel();

        // Escape special characters in the query
        String escapedQuery = Pattern.quote(query);

        TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>(tableModel);
        sorter.setRowFilter(RowFilter.regexFilter("(?i)" + escapedQuery)); // (?i) for case-insensitive search
        dataT.setRowSorter(sorter);
    }//GEN-LAST:event_cariTFKeyPressed

    private void tandaiBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tandaiBTActionPerformed
        // Mendapatkan indeks baris yang dipilih
    int selectedRow = dataT.getSelectedRow();

    // Memastikan ada baris yang dipilih
    if (selectedRow != -1) {
        // Mendapatkan nilai pada kolom "Tandai" dari baris yang dipilih
        DefaultTableModel model = (DefaultTableModel) dataT.getModel();
        Object value = model.getValueAt(selectedRow, 4);

        // Cek apakah nilai tersebut adalah lambang atau huruf yang ingin dihapus
        if (value != null && value.toString().equals("✓")) {
            // Hapus nilai pada kolom "Tandai"
            model.setValueAt("", selectedRow, 4);
            JOptionPane.showMessageDialog(this, "Lambang atau huruf pada baris Tandai telah dihapus.", "Hapus Berhasil", JOptionPane.INFORMATION_MESSAGE);
        } else {
            model.setValueAt("✓", selectedRow, 4);
        }
    } else {
        // Tampilkan pesan jika tidak ada baris yang dipilih
        JOptionPane.showMessageDialog(this, "Pilih baris untuk dihapus.", "Peringatan", JOptionPane.WARNING_MESSAGE);
    }
    }//GEN-LAST:event_tandaiBTActionPerformed

    private void cariTFFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cariTFFocusGained
        if (cariTF.getText().equals("Cari Disini")) {
            cariTF.setText("");
            cariTF.setForeground(new Color(0, 0, 0));
        }
    }//GEN-LAST:event_cariTFFocusGained

    private void cariTFFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cariTFFocusLost
        if (cariTF.getText().equals("")) {
            cariTF.setText("Cari Disini");
            cariTF.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_cariTFFocusLost

    private void resetForm() {
        waktuTF.setText("");
        tanggalDP.setDate(null);
        jRadioButton1.setSelected(false);
        jRadioButton2.setSelected(false);
        isiTA.setText("");
    }

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                // Membuat objek Main
                Main main = new Main();
                // Menampilkan antarmuka pengguna
                main.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField cariTF;
    private javax.swing.JTable dataT;
    private javax.swing.JButton editBT;
    private javax.swing.JButton hapusBT;
    private javax.swing.JButton importBT;
    private javax.swing.JTextArea isiTA;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton printBT;
    private javax.swing.JButton resetBT;
    private javax.swing.JButton simpanBT;
    private javax.swing.JButton tandaiBT;
    private org.jdesktop.swingx.JXDatePicker tanggalDP;
    private javax.swing.JTextField waktuTF;
    // End of variables declaration//GEN-END:variables
}
