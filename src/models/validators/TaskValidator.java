package models.validators;

import java.util.ArrayList;
import java.util.List;

import models.Task;

public class TaskValidator {
    // バリデーションを実行する
    public static List<String> validate(Task t) {
        List<String> errors = new ArrayList<String>();

        // メッセージの必須入力チェック
        String content_error = "";
        if(t.getContent() == null || t.getContent().equals("")) {
            content_error = "メッセージを入力してください。";
        }

        if(!content_error.equals("")) {
            errors.add(content_error);
        }

        return errors;
    }
}