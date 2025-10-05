package com.example.firstandroidproject;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    // Khai báo các biến cho các nút bấm
    Button btnLogin;
    Button btnCreateAccount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // --- CODE TÍCH HỢP ---

        // 1. Ánh xạ (tìm và gán) các nút từ file layout XML
        btnLogin = findViewById(R.id.btnLogin);
        btnCreateAccount = findViewById(R.id.btnCreateAccount);

        // 2. Sự kiện cho nút "Đăng nhập" -> Chuyển sang trang Profile
        btnLogin.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, ProfileActivity.class);
            startActivity(intent);
        });

        // 3. Sự kiện cho nút "Tạo tài khoản" -> Chuyển sang trang Đăng Kí
        btnCreateAccount.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, ManHinhDangKi.class); // Giả sử bạn có màn hình ManHinhDangKi.java
            startActivity(intent);
        });
    }
}