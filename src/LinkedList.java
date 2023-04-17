public class LinkedList<E> {
    private class Body {
        public Body next;
        public E element;
        Body(E element) {
            this.element = element;
            next = null;
        }
        Body(E element, Body next) {
            this.element = element;
            this.next = next;
        }

        public String toString() {
            return "Элемент: " + element;
        }
    }

    private Body head;

    public LinkedList() {
        size = 0;
        head = null;
    }
    private int size;

    private Body getBody(int index) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException();
        }

        Body body = head;
        for (int i = 0; i < index; i++) {
            body = body.next;
        }

        return body;
    }

    public E get(int index) {
        Body body = getBody(index);
        return body.element;
    }

    public void add(E element) {
        if (size == 0) {
            head = new Body(element);
            size++;

        } else {
            Body body = head;

            for(; body.next != null; body = body.next) {
                continue;
            }

            body.next = new Body(element);
            size++;
        }
    }

    public void add(E element, int index) {
        if (index == 0) {
            Body body = getBody(0);
            head = new Body(element, body);
            size++;
        } else {
            Body body = getBody(index - 1);
            body.next = new Body(element, body.next);
            size++;
        }
    }

    public void delete(int index) {
        if (index == 0) {
            Body body = getBody(0);
            head = body.next;
        } else {
            Body body = getBody(index - 1);
            Body copy = getBody(index + 1);
            body.next = copy;
            size--;
        }
    }

    public void delete(Object o) {
        Body body = head;
        int index = 0;
        for(; body.element != o; body = body.next) {
            index++;
        }
        delete(index);
        size--;
    }
}
