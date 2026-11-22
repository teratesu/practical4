package practice19;

public class OnlineStore {
    public void createOrder(Client client) throws InvalidInnException {
        if (!InnValidator.isValid(client.getInn())) {
            throw new InvalidInnException("Недействительный ИНН " + client.getInn()
                    + " у клиента " + client.getFullName());
        }
        System.out.println("Заказ для клиента " + client.getFullName() + " успешно оформлен.");
    }
}
