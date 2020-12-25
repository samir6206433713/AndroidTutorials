package com.tutorial.androidtutorial.contentprovider;

import android.app.Activity;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.tutorial.androidtutorial.R;

public class MainActivity extends Activity {

   public int accessModifier=4;
   protected int accessModifier2=4;
   int accessModifier3=4;

   @Override
   protected void onCreate(Bundle savedInstanceState) {
      super.onCreate(savedInstanceState);
      setContentView(R.layout.content_provider);
   }
   public void onClickAddName(View view) {
      // Add a new student record
      ContentValues values = new ContentValues();
      values.put(StudentsProvider.NAME,
         ((EditText)findViewById(R.id.editText2)).getText().toString());

      values.put(StudentsProvider.GRADE,
         ((EditText)findViewById(R.id.editText3)).getText().toString());

      Uri uri = getContentResolver().insert(
         StudentsProvider.CONTENT_URI, values);

      Toast.makeText(getBaseContext(),
         uri.toString(), Toast.LENGTH_LONG).show();
   }
   public void onClickRetrieveStudents(View view) {
      // Retrieve student records
      String URL = "content://com.example.MyApplication.StudentsProvider";

      Uri students = Uri.parse(URL);
      Cursor c = managedQuery(students, null, null, null, "name");

      if (c.moveToFirst()) {
         do{
            Toast.makeText(this,
               c.getString(c.getColumnIndex(StudentsProvider._ID)) +
                  ", " +  c.getString(c.getColumnIndex( StudentsProvider.NAME)) +
                     ", " + c.getString(c.getColumnIndex( StudentsProvider.GRADE)),
            Toast.LENGTH_SHORT).show();
         } while (c.moveToNext());
      }
   }
}