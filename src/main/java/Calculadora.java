import java.awt.*;
import java.awt.event.*;
 
// Incio classe Calculadora
public class Calculadora
    extends WindowAdapter
{
    // criando o Frame
    Frame frm1 = new Frame("Calculator Fatec-SP");
 
    // criando o Panel
    Panel pnl1 = new Panel(new GridLayout(4,4));
 
    // criando o Menu
    private MenuBar mnb1 = new MenuBar();
    private Menu mn1 = new Menu("Calculadora");
    private MenuItem mi1 = new MenuItem("Sair");
 
    // criando os Botoes.
    private Button btn1 = new Button("1");
    private Button btn2 = new Button("2");
    private Button btn3 = new Button("3");
    private Button btn4 = new Button("4");
    private Button btn5 = new Button("5");
    private Button btn6 = new Button("6");
    private Button btn7 = new Button("7");
    private Button btn8 = new Button("8");
    private Button btn9 = new Button("9");
    private Button btn0 = new Button("0");
    private Button btnLimpar = new Button("Clear");
    private Button btnSomar = new Button("+");
    private Button btnDiminuir = new Button("-");
    private Button btnDividir = new Button("/");
    private Button btnMultiplicar = new Button("x");
    private Button btnResultado = new Button("=");
 
    // Criando o Visor
    private TextField txtF1 = new TextField("");
 
    // variaveis de valor
    private float valor1 = 0;
 
    // Variavel de Operacao
    // 1 - Somar
    // 2 - Diminuir
    // 3 - Dividir
    // 4 - Multiplicar
    private int operacao = 0;
 
    public void setValor1()
    {
        this.valor1 = Float.parseFloat(txtF1.getText());
    }
 
    public float getValor1()
    {
        float aux = valor1;
        valor1 = 0;
        return aux;
    }
 
 
    public Calculadora()
    {
        frm1.addWindowListener(new WindowAdapter()
        {
            public void windowClosing(WindowEvent a)
            {
                System.exit(0);
            }
 
            public void windowOpened(WindowEvent a)
            {
                txtF1.requestFocus();
            }
 
        });
 
 
        mi1.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent a)
            {
                System.exit(0);
            }
        });
 
        btn1.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent a)
            {   
                if(txtF1.getText() == "" || txtF1.getText() == " "){
                    txtF1.setText("1");
                }
                else{
                    txtF1.setText(txtF1.getText() + "1");
                }
            }
        });
 
        btn2.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent a)
            {
                if(txtF1.getText() == "" || txtF1.getText() == " "){
                    txtF1.setText("2");
                }
                else{
                    txtF1.setText(txtF1.getText() + "2");
                }
            }
        });
 
        btn3.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent a)
            {
                if(txtF1.getText() == "" || txtF1.getText() == " "){
                    txtF1.setText("3");
                }
                else{
                    txtF1.setText(txtF1.getText() + "3");
                }
            }
        });
 
        btn4.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent a)
            {
                if(txtF1.getText() == "" || txtF1.getText() == " "){
                    txtF1.setText("4");
                }
                else{
                    txtF1.setText(txtF1.getText() + "4");
                }
            }
        });
 
        btn5.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent a)
            {
                if(txtF1.getText() == "" || txtF1.getText() == " "){
                    txtF1.setText("5");
                }
                else{
                    txtF1.setText(txtF1.getText() + "5");
                }
            }
        });
 
        btn6.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent a)
            {
                if(txtF1.getText() == "" || txtF1.getText() == " "){
                    txtF1.setText("6");
                }
                else{
                    txtF1.setText(txtF1.getText() + "6");
                }
            }
        });
 
        btn7.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent a)
            {
                if(txtF1.getText() == "" || txtF1.getText() == " "){
                    txtF1.setText("7");
                }
                else{
                    txtF1.setText(txtF1.getText() + "7");
                }
            }
        });
 
        btn8.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent a)
            {
                if(txtF1.getText() == "" || txtF1.getText() == " "){
                    txtF1.setText("8");
                }
                else{
                    txtF1.setText(txtF1.getText() + "8");
                }
            }
        });
 
        btn9.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent a)
            {
                if(txtF1.getText() == "" || txtF1.getText() == " "){
                    txtF1.setText("9");
                }
                else{
                    txtF1.setText(txtF1.getText() + "9");
                }
            }
        });
 
        btn0.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent a)
            {
                if(txtF1.getText() == "" || txtF1.getText() == " "){
                    txtF1.setText("0");
                }
                else{
                    txtF1.setText(txtF1.getText() + "0");
                }
            }
        });
 
        btnLimpar.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent a)
            {
                valor1 = 0;
                txtF1.setText("");
            }
        });
 
        btnSomar.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent a)
            {
                setValor1();
                operacao = 1;
                txtF1.setText("");
            }
        });
 
        btnDiminuir.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent a)
            {
                setValor1();
                operacao = 2;
                txtF1.setText("");
            }
        });
 
        btnDividir.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent a)
            {
                setValor1();
                operacao = 3;
                txtF1.setText("");
            }
        });
 
        btnMultiplicar.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent a)
            {
                setValor1();
                operacao = 4;
                txtF1.setText("");
            }
        });
 
 
        btnResultado.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent a)
            {
                switch (operacao)
                {
                    //somar
                    case 1 :
                    {
                        operacao = 0;
                        txtF1.setText(Float.toString(getValor1() + Float.parseFloat(txtF1.getText())));
                        break;
                    }
 
 
                    //diminuir
                    case 2 :
                    {
                        operacao = 0;
                        txtF1.setText(Float.toString(getValor1() - Float.parseFloat(txtF1.getText())));
                        break;
                    }
 
                    //dividir
                    case 3 :
                    {
                        try
                        {
                          operacao = 0;
                          txtF1.setText(Float.toString(getValor1() / Float.parseFloat(txtF1.getText())));
                        }
                        catch(ArithmeticException ex)
                            {
                                txtF1.setText("");
                                System.out.println("É impossível divisão por zero ! erro : " + ex.getMessage());
                            }
                        break;
                    }
 
 
                    //multipicar
                    case 4 :
                    {
                        operacao = 0;
                        txtF1.setText(Float.toString(getValor1() * Float.parseFloat(txtF1.getText())));
                        break;
                    }
 
                    default :
                        System.out.println("Escolha uma operação");
                        break;
                }
            }
        });
 
        frm1.setSize(500,500); // tamamho do Frame
        frm1.setLocationRelativeTo(null);// posiciona na tela
        frm1.setBackground(Color.gray);// Muda a Cor de Fundo
 
        //criando meu menu!!
        mn1.add(mi1);
        mnb1.add(mn1);
        frm1.setMenuBar(mnb1);
 
        // Adicionando o Visor no Frame
        frm1.add(txtF1,BorderLayout.NORTH);
 
        // Adicionando os Botoes no Panel
        pnl1.add(btn7);
        pnl1.add(btn8);
        pnl1.add(btn9);
        pnl1.add(btnDividir);
 
        pnl1.add(btn4);
        pnl1.add(btn5);
        pnl1.add(btn6);
        pnl1.add(btnMultiplicar);
 
        pnl1.add(btn1);
        pnl1.add(btn2);
        pnl1.add(btn3);
        pnl1.add(btnDiminuir);
 
        pnl1.add(btnLimpar);
        pnl1.add(btn0);
        pnl1.add(btnResultado);
        pnl1.add(btnSomar);
 
        //Adicionando Panel no Frame
        frm1.add(pnl1);
 
        //Habilita mostrar o frame // sempre deixa-la como ultima linha!!
        frm1.setVisible(true);
    }
 
    public static void main(String [] args)
    {
        new Calculadora();
    }
}
// fim classe Calculadora