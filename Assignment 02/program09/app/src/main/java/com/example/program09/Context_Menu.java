package com.example.program09;

import android.view.ContextMenu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import androidx.annotation.NonNull;

public class Context_Menu {
    private Button pop_upMenuBtn;
    private ListView listView;
    private String[] contacts = {"Ram", "Sham", "Sachin", "Sima", "Pushpa", "Neha", "Gayatri", "Vrushali", "ketki", "Ganesh", "Swapnil", "Prakash", "Raju"};

    //Context Menu
    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.context_menu, menu);
        menu.setHeaderTitle("Select the Action");
    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
        if(item.getItemId() == R.id.call){
            Toast.makeText(program09.this,"Calling "+item.getTitle(), Toast.LENGTH_SHORT).show();
        } else if(item.getItemId() == R.id.sms){
            Toast.makeText(program09.this,"Sending sms to  "+item.getTitle(), Toast.LENGTH_SHORT).show();
        } else if(item.getItemId() == R.id.delete){
            Toast.makeText(program09.this,"Deleting contact of "+item.getTitle(), Toast.LENGTH_SHORT).show();
        }
        return true;
    }
}