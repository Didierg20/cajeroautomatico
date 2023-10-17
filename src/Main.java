     clase publica principal{
                  público estático vacío principal(String[]args)
            float saldo_inicial=5000;
                  opción int;
            float ingreso,saldoActual,retiro;
                 int saldo=100000;
            int opción=0;
                carroza dineroingresado,retirodinero;
            mientras(opción!=3){
            opción=Entero.parseInt(JOptionPane.showInputDialog("bienvenido al cajero automático coco loco \n "
            +"1.desea ingresar dinero a su cuenta \n "
            +"2.desea sacar dinero de su cuenta \n "
            +"3.salir"));

            opción=Entero.parseInt(JOptionPane.showInputDialog("Bienvenido a su cajero automático \n "
            +"1. ingresar dinero a la cuenta \n "
            +"2. retirar dinero de la cuenta \n "
            +"3. salir"));
            cambiar(opción){
            caso 1:
            dineroingresado=Flotar.parseFloat(JOptionPane.showInputDialog("dijite la cantidad de dinero que va a ingresar a su cuenta"));
            saldo=(int)(saldo+dinero ingresado);
            Panel de opciones J.showMessageDialog(null,"el dinero que tienes en tu cuenta es de"+saldo);
            romper;
            caso 2:
            retirodinero=flotador.parseFloat(JOptionPane.showInputDialog("dijite la cantidad de dinero que deseas retirar de la cuenta"));
            if(retirodinero>saldo){
            Panel de opciones J.showMessageDialog(null,"el dinero que desea ingresar no está disponible para trabajar más");
            }más{
            saldo=(int)(saldo-retirodinero);
            Panel de opciones J.showMessageDialog(null,"el saldo de la cuenta está en"+saldo);

            cambiar(opción){
            caso 1:
            ingreso=flotar.parseFloat(JOptionPane.showInputDialog("Digite la cantidad que desea ingresar en la cuenta: "));
            saldoActual=saldo_inicial+ingreso;
            Panel de opciones J.showMessageDialog(null,"Dinero en cuenta:"+saldoActual);
            romper;
            caso 2:
            retiro=flotar.parseFloat(JOptionPane.showInputDialog(("Digite la cantidad que desean retirar")));
            }
            romper;
            caso 3:
            romper;
            predeterminado:
            Panel de opciones J.showMessageDialog(null,"la opción que ingreso no sale por favor revise su vista");
            romper;

            if(retiro>saldo_inicial){
            Panel de opciones J.showMessageDialog(null,"nocuenta con el saldo suficiente para este retiro");
            }más{
            saldoActual=saldo_inicial-retiro;
            Panel de opciones J.showMessageDialog(null,"Dinero en cuenta:"+saldoActual);
            }
            romper;
            caso 3:
            romper;
            predeterminado:
            Panel de opciones J.showMessageDialog(null,"se equivoco de opción de menú");
            romper;

            }
            }
            }
      }