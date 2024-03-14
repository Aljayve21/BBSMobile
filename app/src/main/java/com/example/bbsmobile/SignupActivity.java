package com.example.bbsmobile;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class SignupActivity extends AppCompatActivity {

//    private EditText fullNameTextEdit, EmailEditText, passwordEditText, confirmPasswordEditText;
//    private Button signupButton;
//
//    private FirebaseAuth maAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_signup);

//        fullNameTextEdit = findViewById(R.id.fname);
//        EmailEditText = findViewById(R.id.email1);
//        passwordEditText = findViewById(R.id.password1);
//        confirmPasswordEditText = findViewById(R.id.conpassword1);
//        signupButton = findViewById(R.id.button2);
//
//        maAuth = FirebaseAuth.getInstance();
//
//        signupButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                signUp();
//            }
//        });




        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

//    private void signUp(){
//        String fullName = fullNameTextEdit.getText().toString().trim();
//        String email = EmailEditText.getText().toString().trim();
//        String password = passwordEditText.getText().toString().trim();
//        String confirmPassword = confirmPasswordEditText.getText().toString().trim();
//
//        if (TextUtils.isEmpty(fullName) || TextUtils.isEmpty(email) ||
//                TextUtils.isEmpty(password) || TextUtils.isEmpty(confirmPassword)) {
//            Toast.makeText(this, "Please fill in all fields", Toast.LENGTH_SHORT).show();
//            return;
//        }
//
//        if (!password.equals(confirmPassword)) {
//            Toast.makeText(this, "Passwords do not match", Toast.LENGTH_SHORT).show();
//            return;
//        }
//
//        maAuth.createUserWithEmailAndPassword(email, password)
//                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
//                    @Override
//                    public void onComplete(@NonNull Task<AuthResult> task) {
//                        if (task.isSuccessful()) {
//
//                            Toast.makeText(SignupActivity.this, "Signup successful", Toast.LENGTH_SHORT).show();
//                            startActivity(new Intent(SignupActivity.this, LoginActivity.class));
//                            finish();
//                        } else {
//                            Toast.makeText(SignupActivity.this, "Authentication failed: " + task.getException().getMessage(),
//                                    Toast.LENGTH_SHORT).show();
//                        }
//                    }
//                });
//    }
}