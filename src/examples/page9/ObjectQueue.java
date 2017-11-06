package examples.page9;



public class ObjectQueue {
    private ObjectBox head = null;
    private ObjectBox tail = null;
    private int size = 0;

    public void push(Object obj) {
        ObjectBox ob = new ObjectBox();
        ob.setObject(obj);
        if (head == null) {
            head = ob;
        } else {
            tail.setNext(ob);
        }
        ob.setPrev(tail);
        tail = ob;
        size++;
    }

    public Object stackPull() {
        if (size == 0) {
            return null;
        }
        Object obj = tail.getObject();
        tail = tail.getPrev();
        if (head == null){
            tail = null;}
        size--;
        return obj;
    }


    /* 1) public Object pushBack(Object obj) {
        ObjectBox ob = new ObjectBox();
        ob.setObject(obj);
        if (head == null) {
            head = ob;
        } else {
            tail.setNext(ob);
        }
        tail= ob;
        size++;
        return obj;
    }*/
   /*2) public void push(Object obj) {
       ObjectBox ob = new ObjectBox();
       ob.setObject(obj);
       if (head == null) {
           head = ob;
       } else {
           tail.setNext(ob);
       }
       ob.setPrev(tail);
       tail = ob;
       size++;
   }*/

    public Object pull() {
        if (size == 0) {
            return null;
        }
        Object obj = head.getObject();
        head = head.getNext();
        if (head == null) {
            tail = null;
        }
        size--;
        return obj;
    }

    public Object pullBack() {
        if (size == 0) {
            return null;
        }
        Object obj = tail.getObject();
        tail = tail.getNext();
        if (tail == null) {
            head = null;
        }
        size--;
        return obj;
    }

    public int size() {
        return size;
    }

    public Object get(int index) {
        if (size == 0 || index >= size || index < 0) {
            return null;
        }
        ObjectBox current = head;
        int pos = 0;
        if (pos < index) {
            current = current.getNext();
            pos++;
        }
        Object obj = current.getObject();
        return obj;
    }

    private class ObjectBox {
        private Object object;
        private ObjectBox next;
        private ObjectBox prev;

        public ObjectBox getPrev() {
            return prev;
        }

        public void setPrev(ObjectBox prev) {
            this.prev = prev;
        }

        public Object getObject() {
            return object;
        }

        public ObjectBox getNext() {
            return next;
        }

        public void setObject(Object object) {
            this.object = object;
        }

        public void setNext(ObjectBox next) {
            this.next = next;
        }
    }
}