package org.vimeClass;

public class Request {
    private int count;
    private int offset;
    private int size;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getOffset() {
        return offset;
    }

    public void setOffset(int offset) {
        this.offset = offset;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Request{" +
                "count=" + count +
                ", offset=" + offset +
                ", size=" + size +
                '}';
    }
}
