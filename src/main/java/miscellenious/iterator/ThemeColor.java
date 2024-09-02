package miscellenious.iterator;

public enum ThemeColor {
    RED,
    YELLOW,
    BLUE,
    GREEN,
    WHITE,
    BLACK;

    public static Iterator<ThemeColor> iterator() {
        return new ThemeColorIterator();
    }

    private static class ThemeColorIterator implements Iterator<ThemeColor> {

        private int position = 0;

        @Override
        public boolean hasNext() {
            return (position < ThemeColor.values().length);
        }

        @Override
        public ThemeColor next() {
            return ThemeColor.values()[position++];
        }
    }
}
