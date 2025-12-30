package com.mingun.mainui;

import com.mingun.array.ArrayProcessor;
import com.mingun.array.LinearArrayProcessor;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class MainUi extends JFrame {
    private JTextField arrayLengthFld = new JTextField("10",10),
            minValFld = new JTextField("1",10),
            maxValFld = new JTextField("100",10);
    private JTextArea resFld = new JTextArea();
    private JLabel arrayLengthLbl, minValLbl, maxValLbl, resLbl;
    private JButton randomBtn = new JButton("<HTML>중복있는<br>" +
                                            "무작위</HTML>"),
            arithmeticBtn = new JButton("순차적"),
            linearBtn = new JButton("선형배열"),
            planeBtn = new JButton("평면배열"),
            ranDupBtn = new JButton("<HTML>중복없는<br>" +
                                        "무작위</HTML>"),
            genBtn = new JButton("생성");
    private final int EX_BTN_LST_LENGTH = 20;

    ArrayList<JButton> exBtnLst = new ArrayList<>();
    ArrayProcessor ap;

    public MainUi() throws HeadlessException {
        setTitle("Array Processor");
        setSize(500,500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        setResizable(false);

        JPanel buttonPanel1 = new JPanel(new GridLayout(1,5));
        JPanel buttonPanel2 = new JPanel(new GridLayout(4,5));
        JPanel textPanel = new JPanel(new GridLayout(4,2));
        JPanel resultPanel = new JPanel();

        arrayLengthLbl = new JLabel("배열길이:");
        minValLbl = new JLabel("최 소 값:");
        maxValLbl = new JLabel("최 대 값:");
        resLbl = new JLabel("결과:");

        for(int i = 0; i < EX_BTN_LST_LENGTH; i++) {
            exBtnLst.add(new JButton(""+(i+1)));
        }

        buttonPanel1.add(randomBtn);
        buttonPanel1.add(ranDupBtn);
        buttonPanel1.add(arithmeticBtn);
        buttonPanel1.add(linearBtn);
        buttonPanel1.add(planeBtn);
        add(buttonPanel1);

        textPanel.add(arrayLengthLbl); textPanel.add(arrayLengthFld);
        textPanel.add(minValLbl); textPanel.add(minValFld);
        textPanel.add(maxValLbl); textPanel.add(maxValFld);
        textPanel.add(genBtn);
        add(textPanel);
        for (int i = 0; i < EX_BTN_LST_LENGTH; i++) {
            buttonPanel2.add(exBtnLst.get(i));
        }
        add(buttonPanel2);

        resultPanel.add(resLbl); resultPanel.add(resFld);
        add(resultPanel);

        randomBtn.addActionListener(e -> {
            try {
                setRandomArray();
                System.out.println("랜덤 배열");
                resFld.setText(resFld.getText()+"랜덤 배열 준비");
            } catch (Exception ex) {
                throw new RuntimeException(ex);
            }
        });

        ranDupBtn.addActionListener(e -> {
            try {
                setRandomArray();
                setDuplicateArray();
                System.out.println("중복없는 랜덤 배열");
            } catch (Exception ex) {
                throw new RuntimeException(ex);
            }
        });

        arithmeticBtn.addActionListener(e -> {
            try {
                setArithmeticArray();
                System.out.println("등차순열 배열");
            } catch (Exception ex) {
                throw new RuntimeException(ex);
            }
        });

        linearBtn.addActionListener(e -> {
            try {
                ap = new LinearArrayProcessor();
                System.out.println("선형 배열을 선택");
            } catch (Exception ex) {
                throw new RuntimeException(ex);
            }
        });


        setVisible(true);
    }

    private void setDuplicateArray() {
        ap.setDuplicate();
    }

    private void setRandomArray() {
        ap.setRandom();
    }

    private void setArithmeticArray() {
        ap.setArithmetic();
    }
}
