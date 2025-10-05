package com.example.firstandroidproject;

import android.os.Bundle;
import android.widget.Button; // Sửa thành Button

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ProfileActivity extends AppCompatActivity {

    // Khai báo biến cho nút "Cài đặt"
    Button settingsButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_profile);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // --- CODE MỚI ---

        // 1. Ánh xạ nút "Cài đặt" từ layout
        settingsButton = findViewById(R.id.settings_button);

        // 2. Thiết lập sự kiện click cho nút "Cài đặt"
        settingsButton.setOnClickListener(v -> {
            // Lệnh finish() sẽ đóng màn hình hiện tại (ProfileActivity)
            // và tự động quay về màn hình đã mở ra nó (chính là MainActivity).
            finish();
        });
    }
}