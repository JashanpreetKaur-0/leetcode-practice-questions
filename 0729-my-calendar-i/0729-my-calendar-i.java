class MyCalendar {

    ArrayList<int[]> list;

    public MyCalendar() {
        list = new ArrayList<>();
    }

    public boolean book(int start, int end) {

        for (int i = 0; i < list.size(); i++) {

            int s = list.get(i)[0];
            int e = list.get(i)[1];

            if (start < e && end > s) {
                return false;
            }
        }

        list.add(new int[]{start, end});

        return true;
    }
}

/**
 * Your MyCalendar object will be instantiated and called as such:
 * MyCalendar obj = new MyCalendar();
 * boolean param_1 = obj.book(startTime,endTime);
 */