package microunit;

/**
 * Provides assertion methods for writing unit tests.
 */
public class Assert {

    /**
     * Fails a test by throwing an {@link AssertionError} with the given
     * message.
     *
     * @param message describes the reason of the failure, may be {@code null}
     */
    public static void fail(String message) {
        if (message == null) {
            throw new AssertionError();
        }
        throw new AssertionError(message);
    }

    /**
     * Fails a test by throwing an {@link AssertionError} with no message.
     */
    public static void fail() {
        fail(null);
    }

    /**
     * Asserts that the given condition is true. If it's not, then an
     * {@link AssertionError} is thrown with the given message.
     *
     * @param condition the condition to be tested
     * @param message the failure message for the case when the condition is
     *                false, may be {@code null}
     */
    public static void assertTrue(boolean condition, String message) {
        if (! condition) {
            fail(message);
        }
    }

    /**
     * Asserts that the given condition is true. If it's not, then an
     * {@link AssertionError} is thrown with no message.
     *
     * @param condition the condition to be tested
     */
    public static void assertTrue(boolean condition) {
        assertTrue(condition, null);
    }

}
