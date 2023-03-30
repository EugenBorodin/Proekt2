// Собственное исключение Invalid Email
  public class InvalidEmail extends IllegalArgumentException {

    public InvalidEmail(String email) {

      super("Некорректный e-mail: " + email);
    }
  }

