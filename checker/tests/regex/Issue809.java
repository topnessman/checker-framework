// Test case for issue #809:
// https://github.com/typetools/checker-framework/issues/809

// @skip-test until the issue is resolved

class Issue809<K extends Enum<K>> {
    K[] array;

    int index = 0;

    String m() {
        return array[index] + "=";
    }
}
