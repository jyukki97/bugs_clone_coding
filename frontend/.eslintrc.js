// https://eslint.org/docs/user-guide/configuring

module.exports = {
    root: true,
    parserOptions: {
        parser: 'babel-eslint',
        sourceType: 'module'
    },
    env: {
        browser: true
    },
    // https://github.com/vuejs/eslint-plugin-vue#priority-a-essential-error-prevention
    // consider switching to `plugin:vue/strongly-recommended` or `plugin:vue/recommended` for stricter rules.
    extends: [
        'plugin:vue/recommended',
    ],
    // required to lint *.vue files
    plugins: [
        'vue'
    ],
    globals: {
        jQuery: true,
        $: true,
        _: true
    },
    rules: {
        'vue/no-v-html': 'off',
        "vue/singleline-html-element-content-newline": 'off',
        'vue/multiline-html-element-content-newline': 'off',
        'vue/html-closing-bracket-newline': 'off',
        'vue/max-attributes-per-line': 'off',
        'vue/html-self-closing': 'off',
        'vue/attribute-hyphenation': 'off',
        'object-property-newline': 'off',
        'valid-jsdoc': 'off',
        'guard-for-in': 'off',
        'no-process-env': 'off',
        'no-nested-ternary': 'off',
        'require-jsdoc': 'off',

        'no-unused-vars': 'warn',
        'space-before-function-paren': ['error', 'always'],
        // 'array-bracket-spacing': ['error', 'always'],
        'object-curly-spacing': ['error', 'always'],

        'indent': [2, 4, { 'SwitchCase': 1, 'ignoreComments': false, 'ImportDeclaration': 1, 'flatTernaryExpressions': false }],
        'vue/html-indent': ['error', 4],
        'complexity': ['error', 20],
        'newline-per-chained-call': ['error', { 'ignoreChainWithDepth': 2 }],
        'dot-notation': ['error', { 'allowKeywords': true }],
        'consistent-this': ['error', 'vm'],
        'max-len': ['warn', { 'code': 300 }],
        'complexity': ['warn', 30]
    }
}
