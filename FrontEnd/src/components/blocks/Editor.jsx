import React, { Component } from "react";
import ReactQuill from "react-quill";
import "react-quill/dist/quill.snow.css";

class Editor extends Component {
  constructor(props) {
    super(props);
  }

  modules = {
    toolbar: [
      //[{ 'font': [] }],
      [{ header: [1, 2, false] }],
      ["bold", "italic", "underline", "strike", "blockquote"],
      [
        { list: "ordered" },
        { list: "bullet" },
        { indent: "-1" },
        { indent: "+1" },
      ],
      ["link", "image"],
      [{ align: [] }, { color: [] }, { background: [] }], // dropdown with defaults from theme
      ["clean"],
    ],
  };

  formats = [
    //'font',
    "header",
    "bold",
    "italic",
    "underline",
    "strike",
    "blockquote",
    "list",
    "bullet",
    "indent",
    "link",
    "image",
    "align",
    "color",
    "background",
  ];

  render() {
    const { value, onChange } = this.props;
    return (
      <div style={{ height: "350px" }}>
        <ReactQuill
          style={{ height: "300px" }}
          theme="snow"
          modules={this.modules}
          formats={this.formats}
          value={value || ""}
          onChange={(content, delta, source, editor) =>
            onChange(editor.getHTML())
          }
          // onChange={(content, delta, source, editor) => onChange(content)}
        />
      </div>
    );
  }
}
export default Editor;
