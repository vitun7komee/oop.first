class NaiveStrategy implements Strategy {
    @Override
    public boolean IsSubstring(String string, String substring)
    {
        if (substring.length() > string.length())
            return false;
        int result = NaiveStringMatcher(string, substring);
        return result != -1;
    }

    private int NaiveStringMatcher(String string, String substring)
    {
        int stringLength = string.length();
        int subStringLength = substring.length();

        for (int i = 0; i <= stringLength - subStringLength; ++i)
        {
            int j = 0;
            while (j < subStringLength && string.charAt(i + j) == substring.charAt(j))
                ++j;
            if (j == subStringLength)
                return i;
        }

        return -1;
    }
}

