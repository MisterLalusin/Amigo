package pro.gr.ams.amigo;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class AppActivity extends AppCompatActivity {

    //Database
    int userCount = 2;
    public int activeUser = -1;
    String u1UserID = "1", u1Email = "rov@gmail.com", u1Pass = "12345678", u1FName = "John Rovic", u1Mname = "Dusdus", u1Lname = "Lalusin", u1Office = "STI Lipa", u1Home = "Niing San Antonio, Quezon", u1Coins = "1000";
    String u2UserID = "2", u2Email = "pao@gmail.com", u2Pass = "12345678", u2FName = "Mae Paulene", u2Mname = "Igtanloc", u2Lname = "Ilagan", u2Office = "STI Lipa", u2Home = "San Felipe, Padre Garcia Batangas", u2Coins = "1000";
    String u3UserID = "3", u3Email = "", u3Pass = "", u3FName = "", u3Mname = "", u3Lname = "", u3Office = "", u3Home = "", u3Coins = "1000";
    String u4UserID = "4", u4Email = "", u4Pass = "", u4FName = "", u4Mname = "", u4Lname = "", u4Office = "", u4Home = "", u4Coins = "1000";
    String u5UserID = "5", u5Email = "", u5Pass = "", u5FName = "", u5Mname = "", u5Lname = "", u5Office = "", u5Home = "", u5Coins = "1000";

    int productCount = 2;
    String p1Id = "1", p1Quantity = "2", p1Value = "28000", p1RateU1 = "3", p1RateU2 = "5", p1RateU3 = "5", p1RateU4 = "3", p1RateU5 = "5", p1Product = "Canon 200D";
    String p2Id = "2", p2Quantity = "69", p2Value = "250", p2RateU1 = "0", p2RateU2 = "0", p2RateU3 = "0", p2RateU4 = "0", p2RateU5 = "0", p2Product = "HP Flashdrive";
    String p3Id = "3", p3Quantity = "0", p3Value = "0", p3RateU1 = "0", p3RateU2 = "0", p3RateU3 = "0", p3RateU4 = "0", p3RateU5 = "0", p3Product = "";
    String p4Id = "4", p4Quantity = "0", p4Value = "0", p4RateU1 = "0", p4RateU2 = "0", p4RateU3 = "0", p4RateU4 = "0", p4RateU5 = "0", p4Product = "";
    String p5Id = "5", p5Quantity = "0", p5Value = "0", p5RateU1 = "0", p5RateU2 = "0", p5RateU3 = "0", p5RateU4 = "0", p5RateU5 = "0", p5Product = "";

    String adminEmail = "admin@admin", adminPass = "12345678";
    //Database

    private EditText login_EmailDTXT;
    private Button login_LogInBTTN;
    private Button login_RegistrationBTTN;
    private EditText login_PassDTXT;

    private String activeAct = "login";
    private EditText register_FnameDTXT;
    private EditText register_MnameDTXT;
    private EditText register_LnameDTXT;
    private EditText register_EmailDTXT;
    private EditText register_OfficeAddressDTXT;
    private EditText register_HomeAddressDTXT;
    private EditText register_PassDTXT;
    private EditText register_ConPassDTXT;
    private Button register_RegisterBTTN;
    private Button register_LogInBTTN;
    private Button admin_AddProductBTTN;
    private Button admin_LogOutBTTN;
    private LinearLayout admin_product1LNRLYT;
    private TextView admin_product1TXTVW;
    private LinearLayout admin_product2LNRLYT;
    private TextView admin_product2TXTVW;
    private LinearLayout admin_product3LNRLYT;
    private TextView admin_product3TXTVW;
    private LinearLayout admin_product4LNRLYT;
    private TextView admin_product4TXTVW;
    private LinearLayout admin_product5LNRLYT;
    private TextView admin_product5TXTVW;
    private LinearLayout addProductLNRLYT;
    private EditText admin_productNameDTTX;
    private EditText admin_CostDTTX;
    private EditText admin_QuantityDTTX;
    private EditText admin_shippingDTTX;
    private Button admin_AddBTTN;
    private TextView client_LNameTXTVW;
    private TextView client_FMNameTXTVW;
    private Button client_AddProductBTTN;
    private Button client_LogOutBTTN;
    private LinearLayout client_product1LNRLYT;
    private TextView client_product1TXTVW;
    private LinearLayout client_product2LNRLYT;
    private TextView client_product2TXTVW;
    private LinearLayout client_product3LNRLYT;
    private TextView client_product3TXTVW;
    private LinearLayout client_product4LNRLYT;
    private TextView client_product4TXTVW;
    private LinearLayout client_product5LNRLYT;
    private TextView client_product5TXTVW;
    private EditText client_productNameDTTX;
    private EditText client_CostDTTX;
    private EditText client_QuantityDTTX;
    private EditText client_shippingDTTX;
    private Button client_AddBTTN;
    private LinearLayout buyLNRLYT;
    private TextView client_productNameTXTVW;
    private TextView client_CostTXTVW;
    private TextView client_ShippingTXTVW;
    private EditText client_CardNumberDTTX;
    private EditText client_CVVDTTX;
    private Button client_BuyBTTN;
    private EditText client_ExpirationDTTX;
    private EditText client_AddressDTTX;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_app);

        try {
            loginActivity();
        }
        catch (Exception ex) {
            Toast.makeText(this, ""+ex, Toast.LENGTH_SHORT).show();
        }
    }

    private void loginActivity() {
        setContentView(R.layout.layout_log_in);
        activeAct = "login";
        backClick = 0;

        login_EmailDTXT = (EditText)findViewById(R.id.login_EmailDTXT);
        login_LogInBTTN = (Button)findViewById(R.id.login_LogInBTTN);
        login_RegistrationBTTN = (Button)findViewById(R.id.login_RegistrationBTTN);
        login_PassDTXT = (EditText)findViewById(R.id.login_PassDTXT);

        login_EmailDTXT.requestFocus();

        login_LogInBTTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String email = login_EmailDTXT.getText().toString();
                String password = login_PassDTXT.getText().toString();
                if (email.replaceAll(" ","").length() == 0 || password.replaceAll(" ","").length() == 0) {
                    Toast.makeText(AppActivity.this, "Complete the required fields", Toast.LENGTH_SHORT).show();
                }
                else if (email.equals(adminEmail) && password.equals(adminPass)) {
                    Toast.makeText(AppActivity.this, "Welcome admin", Toast.LENGTH_SHORT).show();
                    activeUser = 0;
                    adminActivity();
                }
                else if (email.equals(u1Email) && password.equals(u1Pass)) {
                    Toast.makeText(AppActivity.this, "Log in sucessfull!", Toast.LENGTH_SHORT).show();
                    activeUser = 1;
                    clientActivity();
                }
                else if (email.equals(u2Email) && password.equals(u2Pass)) {
                    Toast.makeText(AppActivity.this, "Log in sucessfull!", Toast.LENGTH_SHORT).show();
                    activeUser = 2;
                    clientActivity();
                }
                else if (email.equals(u3Email) && password.equals(u3Pass)) {
                    Toast.makeText(AppActivity.this, "Log in sucessfull!", Toast.LENGTH_SHORT).show();
                    activeUser = 3;
                    clientActivity();
                }
                else if (email.equals(u4Email) && password.equals(u4Pass)) {
                    Toast.makeText(AppActivity.this, "Log in sucessfull!", Toast.LENGTH_SHORT).show();
                    activeUser = 4;
                    clientActivity();
                }
                else if (email.equals(u5Email) && password.equals(u5Pass)) {
                    Toast.makeText(AppActivity.this, "Log in sucessfull!", Toast.LENGTH_SHORT).show();
                    activeUser = 5;
                    clientActivity();
                }
                else {
                    Toast.makeText(AppActivity.this, "Log in failed!", Toast.LENGTH_SHORT).show();
                }
            }
        });

        login_RegistrationBTTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                registerActivity();
            }
        });
    }

    private void adminActivity() {
        setContentView(R.layout.layout_admin);
        activeAct = "admin";
        backClick = 0;
        activeUser = 0;

        admin_AddProductBTTN = (Button)findViewById(R.id.admin_AddProductBTTN);
        admin_LogOutBTTN = (Button)findViewById(R.id.admin_LogOutBTTN);
        admin_product1LNRLYT = (LinearLayout)findViewById(R.id.admin_product1LNRLYT);
        admin_product1TXTVW = (TextView)findViewById(R.id.admin_product1TXTVW);
        admin_product2LNRLYT = (LinearLayout)findViewById(R.id.admin_product2LNRLYT);
        admin_product2TXTVW = (TextView)findViewById(R.id.admin_product2TXTVW);
        admin_product3LNRLYT = (LinearLayout)findViewById(R.id.admin_product3LNRLYT);
        admin_product3TXTVW = (TextView)findViewById(R.id.admin_product3TXTVW);
        admin_product4LNRLYT = (LinearLayout)findViewById(R.id.admin_product4LNRLYT);
        admin_product4TXTVW = (TextView)findViewById(R.id.admin_product4TXTVW);
        admin_product5LNRLYT = (LinearLayout)findViewById(R.id.admin_product5LNRLYT);
        admin_product5TXTVW = (TextView)findViewById(R.id.admin_product5TXTVW);

        addProductLNRLYT = (LinearLayout)findViewById(R.id.addProductLNRLYT);
        admin_productNameDTTX = (EditText)findViewById(R.id.admin_productNameDTTX);
        admin_CostDTTX = (EditText)findViewById(R.id.admin_CostDTTX);
        admin_QuantityDTTX = (EditText)findViewById(R.id.admin_QuantityDTTX);
        admin_shippingDTTX = (EditText)findViewById(R.id.admin_shippingDTTX);
        admin_AddBTTN = (Button)findViewById(R.id.admin_AddBTTN);

        addProductLNRLYT.setVisibility(View.GONE);

        admin_LogOutBTTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clientActivity();
            }
        });

        admin_LogOutBTTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loginActivity();
            }
        });

        admin_product1LNRLYT.setVisibility(View.GONE);
        admin_product2LNRLYT.setVisibility(View.GONE);
        admin_product3LNRLYT.setVisibility(View.GONE);
        admin_product4LNRLYT.setVisibility(View.GONE);
        admin_product5LNRLYT.setVisibility(View.GONE);

        admin_AddProductBTTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                addProductLNRLYT.setVisibility(View.VISIBLE);
            }
        });

        admin_AddBTTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String productName = admin_productNameDTTX.getText().toString();
                String cost = admin_CostDTTX.getText().toString();
                String quantity = admin_QuantityDTTX.getText().toString();
                String shipping = admin_shippingDTTX.getText().toString();
                if (productName.length()==0 || cost.length()==0 || quantity.length()==0 || shipping.length()==0) {
                    Toast.makeText(AppActivity.this, "Complete the required fields!", Toast.LENGTH_SHORT).show();
                }
                else {
                    productCount++;
                    if (productCount == 3) {
                        p3Id = "3"; p3Quantity = quantity; p3Value = cost; p3RateU1 = "0"; p3RateU2 = "0"; p3RateU3 = "0"; p3RateU4 = "0"; p3RateU5 = "0"; p3Product = productName;
                        addProductLNRLYT.setVisibility(View.VISIBLE);
                        adminActivity();
                    }
                    else if (productCount == 4) {
                        p4Id = "4"; p4Quantity = quantity; p4Value = cost; p4RateU1 = "0"; p4RateU2 = "0"; p4RateU3 = "0"; p4RateU4 = "0"; p4RateU5 = "0"; p4Product = productName;
                        addProductLNRLYT.setVisibility(View.VISIBLE);
                        adminActivity();
                    }
                    else if (productCount == 5) {
                        p5Id = "5"; p5Quantity = quantity; p5Value = cost; p5RateU1 = "0"; p5RateU2 = "0"; p5RateU3 = "0"; p5RateU4 = "0"; p5RateU5 = "0"; p5Product = productName;
                        addProductLNRLYT.setVisibility(View.VISIBLE);
                        adminActivity();
                    }
                    else if (productCount > 5) {
                        Toast.makeText(AppActivity.this, "Product postings is limited!", Toast.LENGTH_SHORT).show();
                    }

                }
            }
        });


        if (p1Product.length()!=0) {
            int rateCount = 0;
            if (p1RateU1.length() != 0 && !p1RateU1.equals("0")) {
                rateCount++;
            }
            if (p1RateU2.length() != 0 && !p1RateU2.equals("0")) {
                rateCount++;
            }
            if (p1RateU3.length() != 0 && !p1RateU3.equals("0")) {
                rateCount++;
            }
            if (p1RateU4.length() != 0 && !p1RateU4.equals("0")) {
                rateCount++;
            }
            if (p1RateU1.length() != 0 && !p1RateU5.equals("0")) {
                rateCount++;
            }
            double rate = 0;
            try {
                rate = (Integer.parseInt(p2RateU1) + Integer.parseInt(p2RateU2) + Integer.parseInt(p2RateU3) + Integer.parseInt(p2RateU4) + Integer.parseInt(p2RateU5))/rateCount;
            }
            catch (Exception ex) {}
            admin_product1TXTVW.setText(p1Product + "\n\n" + "Price: " + p1Value + "\nQuantity: " + p1Quantity + "\nRate: " + rate + "/5");
            admin_product1LNRLYT.setVisibility(View.VISIBLE);
        }
        if (p2Product.length()!=0) {
            int rateCount = 0;
            if (p2RateU1.length() != 0 && !p2RateU1.equals("0")) {
                rateCount++;
            }
            if (p2RateU2.length() != 0 && !p2RateU2.equals("0")) {
                rateCount++;
            }
            if (p2RateU3.length() != 0 && !p2RateU3.equals("0")) {
                rateCount++;
            }
            if (p2RateU4.length() != 0 && !p2RateU4.equals("0")) {
                rateCount++;
            }
            if (p2RateU1.length() != 0 && !p2RateU5.equals("0")) {
                rateCount++;
            }
            double rate = 0;
            try {
                rate = (Integer.parseInt(p2RateU1) + Integer.parseInt(p2RateU2) + Integer.parseInt(p2RateU3) + Integer.parseInt(p2RateU4) + Integer.parseInt(p2RateU5))/rateCount;
            }
            catch (Exception ex) {}
            admin_product2TXTVW.setText(p2Product + "\n\n" + "Price: " + p2Value + "\nQuantity: " + p2Quantity + "\nRate: " + rate + "/5");
            admin_product2LNRLYT.setVisibility(View.VISIBLE);
        }
        if (p3Product.length()!=0) {
            int rateCount = 0;
            if (p3RateU1.length() != 0 && !p3RateU1.equals("0")) {
                rateCount++;
            }
            if (p3RateU2.length() != 0 && !p3RateU2.equals("0")) {
                rateCount++;
            }
            if (p3RateU3.length() != 0 && !p3RateU3.equals("0")) {
                rateCount++;
            }
            if (p3RateU4.length() != 0 && !p3RateU4.equals("0")) {
                rateCount++;
            }
            if (p3RateU1.length() != 0 && !p3RateU5.equals("0")) {
                rateCount++;
            }
            double rate = 0;
            try {
                rate = (Integer.parseInt(p3RateU1) + Integer.parseInt(p3RateU2) + Integer.parseInt(p3RateU3) + Integer.parseInt(p3RateU4) + Integer.parseInt(p3RateU5))/rateCount;
            }
            catch (Exception ex) {}
            admin_product3TXTVW.setText(p3Product + "\n\n" + "Price: " + p3Value + "\nQuantity: " + p3Quantity + "\nRate: " + rate + "/5");
            admin_product3LNRLYT.setVisibility(View.VISIBLE);
        }
        if (p4Product.length()!=0) {
            int rateCount = 0;
            if (p4RateU1.length() != 0 && !p4RateU1.equals("0")) {
                rateCount++;
            }
            if (p4RateU2.length() != 0 && !p4RateU2.equals("0")) {
                rateCount++;
            }
            if (p4RateU3.length() != 0 && !p4RateU3.equals("0")) {
                rateCount++;
            }
            if (p4RateU4.length() != 0 && !p4RateU4.equals("0")) {
                rateCount++;
            }
            if (p4RateU1.length() != 0 && !p4RateU5.equals("0")) {
                rateCount++;
            }
            double rate = 0;
            try {
                rate = (Integer.parseInt(p4RateU1) + Integer.parseInt(p4RateU2) + Integer.parseInt(p4RateU3) + Integer.parseInt(p4RateU4) + Integer.parseInt(p4RateU5))/rateCount;
            }
            catch (Exception ex) {}
            admin_product4TXTVW.setText(p4Product + "\n\n" + "Price: " + p4Value + "\nQuantity: " + p4Quantity + "\nRate: " + rate + "/5");
            admin_product4LNRLYT.setVisibility(View.VISIBLE);
        }
        if (p5Product.length()!=0) {
            int rateCount = 0;
            if (p5RateU1.length() != 0 && !p5RateU1.equals("0")) {
                rateCount++;
            }
            if (p5RateU2.length() != 0 && !p5RateU2.equals("0")) {
                rateCount++;
            }
            if (p5RateU3.length() != 0 && !p5RateU3.equals("0")) {
                rateCount++;
            }
            if (p5RateU4.length() != 0 && !p5RateU4.equals("0")) {
                rateCount++;
            }
            if (p5RateU1.length() != 0 && !p5RateU5.equals("0")) {
                rateCount++;
            }
            double rate = 0;
            try {
                rate = (Integer.parseInt(p5RateU1) + Integer.parseInt(p5RateU2) + Integer.parseInt(p5RateU3) + Integer.parseInt(p5RateU4) + Integer.parseInt(p5RateU5))/rateCount;
            }
            catch (Exception ex) {}
            admin_product5TXTVW.setText(p5Product + "\n\n" + "Price: " + p5Value + "\nQuantity: " + p5Quantity + "\nRate: " + rate + "/5");
            admin_product5LNRLYT.setVisibility(View.VISIBLE);
        }

    }

    private void registerActivity() {
        setContentView(R.layout.layout_register);
        activeAct = "register";
        backClick = 0;

        register_FnameDTXT = (EditText)findViewById(R.id.register_FnameDTXT);
        register_MnameDTXT = (EditText)findViewById(R.id.register_MnameDTXT);
        register_LnameDTXT = (EditText)findViewById(R.id.register_LnameDTXT);
        register_EmailDTXT = (EditText)findViewById(R.id.register_EmailDTXT);
        register_OfficeAddressDTXT = (EditText)findViewById(R.id.register_OfficeAddressDTXT);
        register_HomeAddressDTXT = (EditText)findViewById(R.id.register_HomeAddressDTXT);
        register_PassDTXT = (EditText)findViewById(R.id.register_PassDTXT);
        register_ConPassDTXT = (EditText)findViewById(R.id.register_ConPassDTXT);
        register_RegisterBTTN = (Button)findViewById(R.id.register_RegisterBTTN);
        register_LogInBTTN = (Button)findViewById(R.id.register_LogInBTTN);

        register_LogInBTTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loginActivity();
            }
        });

        register_RegisterBTTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String fname = register_FnameDTXT.getText().toString();
                String mname = register_MnameDTXT.getText().toString();
                String lname = register_LnameDTXT.getText().toString();
                String email = register_EmailDTXT.getText().toString();
                String officeAddress = register_OfficeAddressDTXT.getText().toString();
                String homeAddress = register_HomeAddressDTXT.getText().toString();
                String pass = register_PassDTXT.getText().toString();
                String conpass = register_ConPassDTXT.getText().toString();

                if (fname.length() == 0 || mname.length() == 0 || lname.length() == 0 || email.length() == 0 || officeAddress.length() == 0 || homeAddress.length() == 0 || pass.length() == 0 || conpass.length() == 0) {
                    Toast.makeText(AppActivity.this, "Please complete the required fields!", Toast.LENGTH_SHORT).show();
                }
                else if (email.contains("@") != true) {
                    Toast.makeText(AppActivity.this, "Invalid Email!", Toast.LENGTH_SHORT).show();
                }
                else if (pass.length() < 8) {
                    Toast.makeText(AppActivity.this, "Password must be atleast 8 characters!", Toast.LENGTH_SHORT).show();
                }
                else if (conpass.equals(pass) != true) {
                    Toast.makeText(AppActivity.this, "Check your password!", Toast.LENGTH_SHORT).show();
                }
                else if (email.equals(u1Email) || email.equals(u2Email) || email.equals(u3Email) || email.equals(u4Email) || email.equals(u5Email) || email.equals(adminEmail)) {
                    Toast.makeText(AppActivity.this, "Email was used already!", Toast.LENGTH_SHORT).show();
                }
                else {
                    userCount++;
                    if (userCount == 3) {
                        u3UserID = "3"; u3Email = email; u3Pass = pass; u3FName = fname; u3Mname = mname; u3Lname = lname; u3Office = officeAddress; u3Home = homeAddress; u3Coins = "1000";
                        loginActivity();
                    }
                    else if (userCount == 4) {
                        u4UserID = "4"; u4Email = email; u4Pass = pass; u4FName = fname; u4Mname = mname; u4Lname = lname; u4Office = officeAddress; u4Home = homeAddress; u4Coins = "1000";
                        loginActivity();
                    }
                    else if (userCount == 5) {
                        u5UserID = "5"; u5Email = email; u5Pass = pass; u5FName = fname; u5Mname = mname; u5Lname = lname; u5Office = officeAddress; u5Home = homeAddress; u5Coins = "1000";
                        loginActivity();
                    }
                    else {
                        Toast.makeText(AppActivity.this, "To many registration on one device!", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
    }

    private void clientActivity() {
        try {
            setContentView(R.layout.layout_client);
            activeAct = "client";
            backClick = 0;



            client_LNameTXTVW = (TextView)findViewById(R.id.client_LNameTXTVW);
            client_FMNameTXTVW = (TextView)findViewById(R.id.client_FMNameTXTVW);

            client_LogOutBTTN = (Button)findViewById(R.id.client_LogOutBTTN);
            client_product1LNRLYT = (LinearLayout)findViewById(R.id.client_product1LNRLYT);
            client_product1TXTVW = (TextView)findViewById(R.id.client_product1TXTVW);
            client_product2LNRLYT = (LinearLayout)findViewById(R.id.client_product2LNRLYT);
            client_product2TXTVW = (TextView)findViewById(R.id.client_product2TXTVW);
            client_product3LNRLYT = (LinearLayout)findViewById(R.id.client_product3LNRLYT);
            client_product3TXTVW = (TextView)findViewById(R.id.client_product3TXTVW);
            client_product4LNRLYT = (LinearLayout)findViewById(R.id.client_product4LNRLYT);
            client_product4TXTVW = (TextView)findViewById(R.id.client_product4TXTVW);
            client_product5LNRLYT = (LinearLayout)findViewById(R.id.client_product5LNRLYT);
            client_product5TXTVW = (TextView)findViewById(R.id.client_product5TXTVW);

            buyLNRLYT = (LinearLayout)findViewById(R.id.buyLNRLYT);
            client_productNameTXTVW = (TextView)findViewById(R.id.client_productNameTXTVW);
            client_CostTXTVW = (TextView)findViewById(R.id.client_CostTXTVW);
            client_ShippingTXTVW = (TextView)findViewById(R.id.client_ShippingTXTVW);
            client_AddressDTTX = (EditText) findViewById(R.id.client_AddressDTTX);
            client_QuantityDTTX = (EditText) findViewById(R.id.client_QuantityDTTX);
            client_CardNumberDTTX = (EditText)findViewById(R.id.client_CardNumberDTTX);
            client_ExpirationDTTX = (EditText)findViewById(R.id.client_ExpirationDTTX);
            client_CVVDTTX = (EditText)findViewById(R.id.client_CVVDTTX);
            client_BuyBTTN = (Button)findViewById(R.id.client_BuyBTTN);
            buyLNRLYT.setVisibility(View.GONE);

            client_product1LNRLYT.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    buyLNRLYT.setVisibility(View.VISIBLE);
                    client_productNameTXTVW.setText("Product: " + p1Product);
                    client_CostTXTVW.setText("Cost: " + p1Value);
                    client_ShippingTXTVW.setText("Shipping: " + "69");
                    if (activeUser == 1) {
                        client_AddressDTTX.setText(u1Home);
                    }
                    else if (activeUser == 2) {
                        client_AddressDTTX.setText(u2Home);
                    }
                    else if (activeUser == 3) {
                        client_AddressDTTX.setText(u3Home);
                    }
                    else if (activeUser == 4) {
                        client_AddressDTTX.setText(u4Home);
                    }
                    else if (activeUser == 5) {
                        client_AddressDTTX.setText(u5Home);
                    }

                    client_BuyBTTN.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            if (client_AddressDTTX.getText().toString().length() == 0 ||  client_QuantityDTTX.getText().toString().length() == 0 || client_CardNumberDTTX.getText().toString().length() == 0 || client_ExpirationDTTX.getText().toString().length() == 0 || client_CVVDTTX.getText().toString().length() == 0) {
                                Toast.makeText(AppActivity.this, "Complete the required fields!", Toast.LENGTH_SHORT).show();
                            }

                            else if (Integer.parseInt(p1Quantity) < Integer.parseInt(client_QuantityDTTX.getText().toString())) {
                                Toast.makeText(AppActivity.this, "Limited stock available!", Toast.LENGTH_SHORT).show();
                            }

                            else {
                                p1Quantity = (Integer.parseInt(p1Quantity) - Integer.parseInt(client_QuantityDTTX.getText().toString())) + "";
                                Intent i = new Intent(getApplicationContext(), OnProcessActivity.class);startActivity(i);
                                clientActivity();
                            }
                        }
                    });
                }
            });
            client_product2LNRLYT.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    buyLNRLYT.setVisibility(View.VISIBLE);
                    client_productNameTXTVW.setText("Product: " + p2Product);
                    client_CostTXTVW.setText("Cost: " + p2Value);
                    client_ShippingTXTVW.setText("Shipping: " + "69");
                    if (activeUser == 1) {
                        client_AddressDTTX.setText(u1Home);
                    }
                    else if (activeUser == 2) {
                        client_AddressDTTX.setText(u2Home);
                    }
                    else if (activeUser == 3) {
                        client_AddressDTTX.setText(u3Home);
                    }
                    else if (activeUser == 4) {
                        client_AddressDTTX.setText(u4Home);
                    }
                    else if (activeUser == 5) {
                        client_AddressDTTX.setText(u5Home);
                    }

                    client_BuyBTTN.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            if (client_AddressDTTX.getText().toString().length() == 0 ||  client_QuantityDTTX.getText().toString().length() == 0 || client_CardNumberDTTX.getText().toString().length() == 0 || client_ExpirationDTTX.getText().toString().length() == 0 || client_CVVDTTX.getText().toString().length() == 0) {
                                Toast.makeText(AppActivity.this, "Complete the required fields!", Toast.LENGTH_SHORT).show();
                            }


                            else if (Integer.parseInt(p2Quantity) < Integer.parseInt(client_QuantityDTTX.getText().toString())) {
                                Toast.makeText(AppActivity.this, "Limited stock available!", Toast.LENGTH_SHORT).show();
                            }

                            else {
                                p2Quantity = (Integer.parseInt(p2Quantity) - Integer.parseInt(client_QuantityDTTX.getText().toString())) + "";
                                Intent i = new Intent(getApplicationContext(), OnProcessActivity.class);startActivity(i);
                                clientActivity();
                            }
                        }
                    });
                }
            });
            client_product3LNRLYT.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    buyLNRLYT.setVisibility(View.VISIBLE);
                    client_productNameTXTVW.setText("Product: " + p3Product);
                    client_CostTXTVW.setText("Cost: " + p3Value);
                    client_ShippingTXTVW.setText("Shipping: " + "69");
                    if (activeUser == 1) {
                        client_AddressDTTX.setText(u1Home);
                    }
                    else if (activeUser == 2) {
                        client_AddressDTTX.setText(u2Home);
                    }
                    else if (activeUser == 3) {
                        client_AddressDTTX.setText(u3Home);
                    }
                    else if (activeUser == 4) {
                        client_AddressDTTX.setText(u4Home);
                    }
                    else if (activeUser == 5) {
                        client_AddressDTTX.setText(u5Home);
                    }

                    client_BuyBTTN.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            if (client_AddressDTTX.getText().toString().length() == 0 ||  client_QuantityDTTX.getText().toString().length() == 0 || client_CardNumberDTTX.getText().toString().length() == 0 || client_ExpirationDTTX.getText().toString().length() == 0 || client_CVVDTTX.getText().toString().length() == 0) {
                                Toast.makeText(AppActivity.this, "Complete the required fields!", Toast.LENGTH_SHORT).show();
                            }

                            else if (Integer.parseInt(p3Quantity) < Integer.parseInt(client_QuantityDTTX.getText().toString())) {
                                Toast.makeText(AppActivity.this, "Limited stock available!", Toast.LENGTH_SHORT).show();
                            }

                            else {
                                p3Quantity = (Integer.parseInt(p3Quantity) - Integer.parseInt(client_QuantityDTTX.getText().toString())) + "";
                                Intent i = new Intent(getApplicationContext(), OnProcessActivity.class);startActivity(i);
                                clientActivity();
                            }
                        }
                    });
                }
            });
            client_product4LNRLYT.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    buyLNRLYT.setVisibility(View.VISIBLE);
                    client_productNameTXTVW.setText("Product: " + p4Product);
                    client_CostTXTVW.setText("Cost: " + p4Value);
                    client_ShippingTXTVW.setText("Shipping: " + "69");
                    if (activeUser == 1) {
                        client_AddressDTTX.setText(u1Home);
                    }
                    else if (activeUser == 2) {
                        client_AddressDTTX.setText(u2Home);
                    }
                    else if (activeUser == 3) {
                        client_AddressDTTX.setText(u3Home);
                    }
                    else if (activeUser == 4) {
                        client_AddressDTTX.setText(u4Home);
                    }
                    else if (activeUser == 5) {
                        client_AddressDTTX.setText(u5Home);
                    }

                    client_BuyBTTN.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            if (client_AddressDTTX.getText().toString().length() == 0 ||  client_QuantityDTTX.getText().toString().length() == 0 || client_CardNumberDTTX.getText().toString().length() == 0 || client_ExpirationDTTX.getText().toString().length() == 0 || client_CVVDTTX.getText().toString().length() == 0) {
                                Toast.makeText(AppActivity.this, "Complete the required fields!", Toast.LENGTH_SHORT).show();
                            }
                            else if (Integer.parseInt(p4Quantity) < Integer.parseInt(client_QuantityDTTX.getText().toString())) {
                                Toast.makeText(AppActivity.this, "Limited stock available!", Toast.LENGTH_SHORT).show();
                            }

                            else {
                                p4Quantity = (Integer.parseInt(p4Quantity) - Integer.parseInt(client_QuantityDTTX.getText().toString())) + "";
                                Intent i = new Intent(getApplicationContext(), OnProcessActivity.class);startActivity(i);
                                clientActivity();
                            }
                        }
                    });
                }
            });
            client_product5LNRLYT.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    buyLNRLYT.setVisibility(View.VISIBLE);
                    client_productNameTXTVW.setText("Product: " + p5Product);
                    client_CostTXTVW.setText("Cost: " + p5Value);
                    client_ShippingTXTVW.setText("Shipping: " + "69");
                    if (activeUser == 1) {
                        client_AddressDTTX.setText(u1Home);
                    }
                    else if (activeUser == 2) {
                        client_AddressDTTX.setText(u2Home);
                    }
                    else if (activeUser == 3) {
                        client_AddressDTTX.setText(u3Home);
                    }
                    else if (activeUser == 4) {
                        client_AddressDTTX.setText(u4Home);
                    }
                    else if (activeUser == 5) {
                        client_AddressDTTX.setText(u5Home);
                    }

                    client_BuyBTTN.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            if (client_AddressDTTX.getText().toString().length() == 0 ||  client_QuantityDTTX.getText().toString().length() == 0 || client_CardNumberDTTX.getText().toString().length() == 0 || client_ExpirationDTTX.getText().toString().length() == 0 || client_CVVDTTX.getText().toString().length() == 0) {
                                Toast.makeText(AppActivity.this, "Complete the required fields!", Toast.LENGTH_SHORT).show();
                            }


                            else if (Integer.parseInt(p5Quantity) < Integer.parseInt(client_QuantityDTTX.getText().toString())) {
                                Toast.makeText(AppActivity.this, "Limited stock available!", Toast.LENGTH_SHORT).show();
                            }

                            else {
                                p5Quantity = (Integer.parseInt(p5Quantity) - Integer.parseInt(client_QuantityDTTX.getText().toString())) + "";
                                Intent i = new Intent(getApplicationContext(), OnProcessActivity.class);startActivity(i);
                                clientActivity();
                            }
                        }
                    });
                }
            });


            client_LogOutBTTN.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    clientActivity();
                }
            });

            client_LogOutBTTN.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    loginActivity();
                }
            });

            client_product1LNRLYT.setVisibility(View.GONE);
            client_product2LNRLYT.setVisibility(View.GONE);
            client_product3LNRLYT.setVisibility(View.GONE);
            client_product4LNRLYT.setVisibility(View.GONE);
            client_product5LNRLYT.setVisibility(View.GONE);

            if (activeUser == 1) {
                client_LNameTXTVW.setText(u1Lname);
                client_FMNameTXTVW.setText(u1FName + " " + u1Mname);
            }
            else if (activeUser == 2) {
                client_LNameTXTVW.setText(u2Lname);
                client_FMNameTXTVW.setText(u2FName + " " + u2Mname);
            }
            else if (activeUser == 3) {
                client_LNameTXTVW.setText(u3Lname);
                client_FMNameTXTVW.setText(u3FName + " " + u3Mname);
            }
            else if (activeUser == 4) {
                client_LNameTXTVW.setText(u4Lname);
                client_FMNameTXTVW.setText(u4FName + " " + u4Mname);
            }
            else if (activeUser == 5) {
                client_LNameTXTVW.setText(u5Lname);
                client_FMNameTXTVW.setText(u5FName + " " + u5Mname);
            }



            if (p1Product.length()!=0) {
                int rateCount = 0;
                if (p1RateU1.length() != 0 && !p1RateU1.equals("0")) {
                    rateCount++;
                }
                if (p1RateU2.length() != 0 && !p1RateU2.equals("0")) {
                    rateCount++;
                }
                if (p1RateU3.length() != 0 && !p1RateU3.equals("0")) {
                    rateCount++;
                }
                if (p1RateU4.length() != 0 && !p1RateU4.equals("0")) {
                    rateCount++;
                }
                if (p1RateU1.length() != 0 && !p1RateU5.equals("0")) {
                    rateCount++;
                }
                double rate = 0;
                try {
                    rate = (Integer.parseInt(p2RateU1) + Integer.parseInt(p2RateU2) + Integer.parseInt(p2RateU3) + Integer.parseInt(p2RateU4) + Integer.parseInt(p2RateU5))/rateCount;
                }
                catch (Exception ex) {}
                client_product1TXTVW.setText(p1Product + "\n\n" + "Price: " + p1Value + "\nQuantity: " + p1Quantity + "\nRate: " + rate + "/5");
                client_product1LNRLYT.setVisibility(View.VISIBLE);
            }
            if (p2Product.length()!=0) {
                int rateCount = 0;
                if (p2RateU1.length() != 0 && !p2RateU1.equals("0")) {
                    rateCount++;
                }
                if (p2RateU2.length() != 0 && !p2RateU2.equals("0")) {
                    rateCount++;
                }
                if (p2RateU3.length() != 0 && !p2RateU3.equals("0")) {
                    rateCount++;
                }
                if (p2RateU4.length() != 0 && !p2RateU4.equals("0")) {
                    rateCount++;
                }
                if (p2RateU1.length() != 0 && !p2RateU5.equals("0")) {
                    rateCount++;
                }
                double rate = 0;
                try {
                    rate = (Integer.parseInt(p2RateU1) + Integer.parseInt(p2RateU2) + Integer.parseInt(p2RateU3) + Integer.parseInt(p2RateU4) + Integer.parseInt(p2RateU5))/rateCount;
                }
                catch (Exception ex) {}
                client_product2TXTVW.setText(p2Product + "\n\n" + "Price: " + p2Value + "\nQuantity: " + p2Quantity + "\nRate: " + rate + "/5");
                client_product2LNRLYT.setVisibility(View.VISIBLE);
            }
            if (p3Product.length()!=0) {
                int rateCount = 0;
                if (p3RateU1.length() != 0 && !p3RateU1.equals("0")) {
                    rateCount++;
                }
                if (p3RateU2.length() != 0 && !p3RateU2.equals("0")) {
                    rateCount++;
                }
                if (p3RateU3.length() != 0 && !p3RateU3.equals("0")) {
                    rateCount++;
                }
                if (p3RateU4.length() != 0 && !p3RateU4.equals("0")) {
                    rateCount++;
                }
                if (p3RateU1.length() != 0 && !p3RateU5.equals("0")) {
                    rateCount++;
                }
                double rate = 0;
                try {
                    rate = (Integer.parseInt(p3RateU1) + Integer.parseInt(p3RateU2) + Integer.parseInt(p3RateU3) + Integer.parseInt(p3RateU4) + Integer.parseInt(p3RateU5))/rateCount;
                }
                catch (Exception ex) {}
                client_product3TXTVW.setText(p3Product + "\n\n" + "Price: " + p3Value + "\nQuantity: " + p3Quantity + "\nRate: " + rate + "/5");
                client_product3LNRLYT.setVisibility(View.VISIBLE);
            }
            if (p4Product.length()!=0) {
                int rateCount = 0;
                if (p4RateU1.length() != 0 && !p4RateU1.equals("0")) {
                    rateCount++;
                }
                if (p4RateU2.length() != 0 && !p4RateU2.equals("0")) {
                    rateCount++;
                }
                if (p4RateU3.length() != 0 && !p4RateU3.equals("0")) {
                    rateCount++;
                }
                if (p4RateU4.length() != 0 && !p4RateU4.equals("0")) {
                    rateCount++;
                }
                if (p4RateU1.length() != 0 && !p4RateU5.equals("0")) {
                    rateCount++;
                }
                double rate = 0;
                try {
                    rate = (Integer.parseInt(p4RateU1) + Integer.parseInt(p4RateU2) + Integer.parseInt(p4RateU3) + Integer.parseInt(p4RateU4) + Integer.parseInt(p4RateU5))/rateCount;
                }
                catch (Exception ex) {}
                client_product4TXTVW.setText(p4Product + "\n\n" + "Price: " + p4Value + "\nQuantity: " + p4Quantity + "\nRate: " + rate + "/5");
                client_product4LNRLYT.setVisibility(View.VISIBLE);
            }
            if (p5Product.length()!=0) {
                int rateCount = 0;
                if (p5RateU1.length() != 0 && !p5RateU1.equals("0")) {
                    rateCount++;
                }
                if (p5RateU2.length() != 0 && !p5RateU2.equals("0")) {
                    rateCount++;
                }
                if (p5RateU3.length() != 0 && !p5RateU3.equals("0")) {
                    rateCount++;
                }
                if (p5RateU4.length() != 0 && !p5RateU4.equals("0")) {
                    rateCount++;
                }
                if (p5RateU1.length() != 0 && !p5RateU5.equals("0")) {
                    rateCount++;
                }
                double rate = 0;
                try {
                    rate = (Integer.parseInt(p5RateU1) + Integer.parseInt(p5RateU2) + Integer.parseInt(p5RateU3) + Integer.parseInt(p5RateU4) + Integer.parseInt(p5RateU5))/rateCount;
                }
                catch (Exception ex) {}
                client_product5TXTVW.setText(p5Product + "\n\n" + "Price: " + p5Value + "\nQuantity: " + p5Quantity + "\nRate: " + rate + "/5");
                client_product5LNRLYT.setVisibility(View.VISIBLE);




                client_product1LNRLYT.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                    }
                });



            }
        }
        catch (Exception ex) {
            Toast.makeText(this, ""+ex, Toast.LENGTH_SHORT).show();
        }
    }


    int backClick = 0;
    @Override
    public void onBackPressed() {
        if (activeAct.equals("login")) {
            backClick++;
            if (backClick>=2) {
                super.onBackPressed();
            }
            else {
                Toast.makeText(this, "Press again to exit!", Toast.LENGTH_SHORT).show();
            }
        }
        else if (activeAct.equals("register")) {
            loginActivity();
        }
    }
}
